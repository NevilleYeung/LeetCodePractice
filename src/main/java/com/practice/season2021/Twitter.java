package com.practice.season2021;

import java.util.*;

/**
 * 355. 设计推特
 * https://leetcode-cn.com/problems/design-twitter/
 */
public class Twitter {
//    private TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
    private int time = 0;
    // 推文map <userId, list(TweetIdMsg)>
    private Map<Integer, List<TweetIdMsg>> tweetIdMap = new HashMap<>();
    // 关注map <userId, set(followers)>
    private Map<Integer, Set<Integer>> followMap = new HashMap<>();

    /** Initialize your data structure here. */
    public Twitter() {
    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        List<TweetIdMsg> list = tweetIdMap.getOrDefault(userId, new ArrayList<>());
        list.add(new TweetIdMsg(tweetId, time));
        tweetIdMap.put(userId, list);

        time++;
    }

    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        // 获取user和关注的user
        List<Integer> userIdList = new ArrayList<>();
        userIdList.add(userId);
        Set<Integer> followSet = followMap.get(userId);
        if (followSet != null && !followSet.isEmpty()) {
            userIdList.addAll(followSet);
        }

        // 获取每个相关用户的前十条推文
        List<TweetIdMsg> allTweetIdList = new ArrayList<>();
        for (int uId : userIdList) {
            List<TweetIdMsg> tweetIds = tweetIdMap.getOrDefault(uId, new ArrayList<>());
            if (tweetIds.size() > 10) {
                for (int i = tweetIds.size() - 1; i >= tweetIds.size() - 10; i--) {
                    allTweetIdList.add(tweetIds.get(i));
                }
            } else {
                allTweetIdList.addAll(tweetIds);
            }
        }

        allTweetIdList.sort(new Comparator<TweetIdMsg>() {
            @Override
            public int compare(TweetIdMsg o1, TweetIdMsg o2) {
                if (o1.time > o2.time) {
                    return -1;
                }
                return 1;
            }
        });

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < allTweetIdList.size(); i++) {
            ans.add(allTweetIdList.get(i).tweetId);
            if (ans.size() == 10) {
                break;
            }
        }

        return ans;
    }

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        Set<Integer> set = followMap.getOrDefault(followerId, new HashSet<>());
        set.add(followeeId);
        followMap.put(followerId, set);
    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        Set<Integer> set = followMap.get(followerId);
        if (set == null || set.isEmpty()) {
            return;
        }

        set.remove(followeeId);
        followMap.put(followerId, set);
    }

    private class TweetIdMsg {
        int tweetId;
        int time;
        public TweetIdMsg(int tweetId, int time) {
            this.tweetId = tweetId;
            this.time = time;
        }
    }
}

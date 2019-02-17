package com.practice.season1_2019;

/**
 * 236. 二叉树的最近公共祖先
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */
public class TreeLowestCommonAncestor
{
    /*
    给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
    百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
    例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]

         3
       /   \
      5     1
     / \   / \
    6   2  0  8
       / \
      7   4

    示例 1:
    输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
    输出: 3
    解释: 节点 5 和节点 1 的最近公共祖先是节点 3。

    示例 2:
    输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
    输出: 5
    解释: 节点 5 和节点 4 的最近公共祖先是节点 5。因为根据定义最近公共祖先节点可以为节点本身。

    说明:
    所有节点的值都是唯一的。
    p、q 为不同节点且均存在于给定的二叉树中。
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
        if (root == null)
        {
            return null;
        }
        // 如果根节点是结点之一，则根节点必定是两结点的最近公共祖先
        if (root == p || root == q)
        {
            return root;
        }


        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // 左右都不为空，即分别在左右子树找到了两个结点，则根节点必定为最近公共祖先
        if (left != null && right != null)
        {
            return root;
        }
        // 只有left不为空，则说明另一个结点必定是左的子结点，则最近公共祖先必定为left
        else if (left != null)
        {
            return left;
        }
        // 同上
        else if (right != null)
        {
            return right;
        }

        // 左右都是空，该子二叉树不存在p、q结点
        return null;
    }
}

package com.practice.alearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abc","", "jkl");
        Set<String> sets = strings.stream().collect(Collectors.toSet());

        System.out.println(sets);

//        Thread t = new Thread(()->{
//            while (true) {
//                System.out.println(1);
////                if (Thread.currentThread().isInterrupted()) {
////                    System.out.println("interrupted!!!!");
////                }
//                try {
//                    Thread.sleep(4000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        t.start();

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        t.interrupt();


        // TODO
//        Test test = new Test();
//        int i = 0;
//        test.inc(i);
//        System.out.println("iiii=" + i);
//
//        i = i++;
//        System.out.println(i);

        // TODO
//        int count = 0;
//        int num = 0;
//        for (int i = 0; i <= 100; i++) {
//            num = num + i;
//            count = count++;
//        }
//        System.out.println(num * count);


        // TODO 正则表达式
        Pattern pattern = Pattern.compile("Java");
        String test="123Java456Java789Java";
        String[] result = pattern.split(test);
        for(String s : result) {
            System.out.println(s);
        }

        // Matcher类提供了三个返回boolean值得匹配方法：matches()，lookingAt()，find()，find(int start)，
        // 其中matches()用于全字符串匹配，lookingAt从字符串最开头开始匹配满足的子串，find可以对任意位置字符串匹配,其中start为起始查找索引值。
//        Pattern pattern = Pattern.compile("Java");
        String test1 = "Java";
        String test2 = "Java1234";
        String test3 = "1234Java";
        Matcher matcher = pattern.matcher(test1);
        System.out.println("test1,match=" + matcher.matches());//返回true
        matcher = pattern.matcher(test2);
        System.out.println("test2,match=" + matcher.matches());//返回false

        matcher = pattern.matcher(test2);
        System.out.println("test2,lookingAt=" + matcher.lookingAt()); //返回true
        matcher = pattern.matcher(test3);
        System.out.println("test3,lookingAt=" + matcher.lookingAt());//返回false

        matcher = pattern.matcher(test1);
        System.out.println("test1,find=" + matcher.find());//返回true
        matcher = pattern.matcher(test2);
        System.out.println("test2,find=" + matcher.find());//返回true
        matcher = pattern.matcher(test3);
        System.out.println("test3,find 2=" + matcher.find(2));//返回true
        matcher = pattern.matcher(test3);
        System.out.println("test3,find 5=" + matcher.find(5));//返回false
        System.out.println("test3,find 4=" + matcher.find(4));//返回true

        String testStr = "北京市(海淀区)(朝阳区)(西城区)";
        pattern = Pattern.compile(".*?(?=\\()");
        matcher = pattern.matcher(testStr);
        System.out.println("beijing test=" + matcher.find() + ", group=" + matcher.group());

        testStr = "com.jd.".replaceAll(".", "/") + "MyClass.class";
        System.out.println("replace=" + testStr); // . 匹配所有


        // TODO
        String a = "1";
        int b = 1;
        int c = 2;
        System.out.println(a + b + c); // 打印 112
    }

    public void inc(int i) {
        i++;
        System.out.println("i=" + i);
    }
}

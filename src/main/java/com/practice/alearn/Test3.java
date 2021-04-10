package com.practice.alearn;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Test3 {
    public static void main(String[] args) {
        int [] a = {3,3};

//        Class<?> cls = A.class;//获取指定类的Class对象
////        Constructor<?>[] constructors = cls.getDeclaredConstructors();  //获取全部构造
////        for (Constructor<?> cons : constructors) {
////            System.out.println(cons);
////        }
//        Field[] fields = cls.getDeclaredFields();
//        try {
//            Object o = cls.newInstance();
//            System.out.println("shit?");
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        for (Field f: fields) {
////            fields.getClass(cls);
//            System.out.println(f);
//        }

        int [] input = {5,3,1,2,4};
        int [] re = nextExceed(input);
        System.out.println("re = " + Arrays.toString(re));

    }

    public static int[] nextExceed(int[] input) {
        int[] result = new int[input.length];
        Arrays.fill(result, -1);
        Deque<Integer> stack = new ArrayDeque<>(input.length);
//        System.out.println("stack=" + stack); // TODO
        for (int i = 0; i < input.length; i++) {
            while (!stack.isEmpty() && input[i] > input[stack.peek()]) {
                int top = stack.pop();
                result[top] = i - top;
                System.out.println("i=" + i + ",top=" + top + ", stack=" + stack + ", result=" + Arrays.toString(result)); // TODO
            }
            stack.push(i);
            System.out.println("stack=" + stack); // TODO
        }
        return result;
    }
}

package com.practice.alearn;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Test1 {


    private static void tt() {
        System.out.println("shit");
    }

    static final int i = 1; // final变量必须被初始化
    int j;

    public static void main(String[] args) throws Exception {
//        ((Test1)null).tt();
//
//        final int a = 1;
//        System.out.println(a);
//
//        System.out.println(func1());
//
//        short s = 128;
//        byte b = (byte) s;
//        System.out.println(s);
//        System.out.println(b);
//
//        int i = 5;
//        int j = 10;
//        System.out.println(i + ~j);
//
//        System.out.println("~6=" + ~6);

        // TODO
//        byte[] src = new byte[0], dst;
//        try {
//            dst = new String(src, "GBK").getBytes("UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }

        // TODO
//        Integer integer = 42;
//        Long l = 42l;
//        Double d = 42.0;
////        System.out.println("integer == l" + (integer == l)); // 编译错误
////        System.out.println("integer == d" + (integer == d)); // 编译错误
////        System.out.println("l == d" + (l == d)); // 编译错误
//        System.out.println("integer.equals(d)" + integer.equals(d));
//        System.out.println("d.equals(l)" + d.equals(l));
//        System.out.println("integer.equals(l)" + integer.equals(l));
//        System.out.println("l.equals(42L)" + l.equals(42L));


        // TODO
//        Integer i1 = 59;
//        int i2 = 59;
//        Integer i3 = Integer.valueOf(59);
//        Integer i4 = new Integer(59);
//        System.out.println("i1 == i2 " + (i1 == i2));
//        System.out.println("i1 == i3 " + (i1 == i3));
//        System.out.println("i3 == i4 " + (i3 == i4));
//        System.out.println("i2 == i4 " + (i2 == i4));

        // TODO
//        long te = 012;
//        float f = -412;
////        int oh = (int) true; // 编译报错
//        double dd = 0x12345678;
////        byte bb = 128; // 编译报错
//        System.out.println(te);
//        System.out.println(f);
//        System.out.println(dd);

        // TODO
//        Integer.parseInt("1"); // 该方法返回的是整数

        // TODO
//        int x = 1;
//        float y = 2;
//        System.out.println(x/y);  // 输出0.5

        // TODO
//        double d = 5.3e12;

        // TODO
        System.out.println("func = " + func());

        // TODO
//        try {
//            int i = 100 / 0;
//            System.out.println(i);
//        } catch (Exception e) {
//            System.out.print(1);
//            throw new RuntimeException();
//        } finally {
//            System.out.println(2);
//        }
//        System.out.println(3);

        // TODO 数组溢出异常
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(4);
//        list.add(1);
//        list.add(3);
//        list.add(5);
//        for (int i = 0; i < list.size(); ++i) {
//            int v = list.get(i);
//            if (v % 2 == 0) {
//                list.remove(v);
//            }
//        }
//        System.out.println(list);

        // TODO
//        char alpha = 'A';
//        int foo = 65;
//        boolean trueExp = true;
//        System.out.println(trueExp ? alpha : 0);
//        System.out.println(trueExp ? alpha : foo);

        // TODO
//        TreeSet<Person> personSet = new TreeSet<>((o1, o2) -> o1.age - o2.age);
//        personSet.add(new Person("zhao", 2));
//        personSet.add(new Person("qian", 4));
//        personSet.add(new Person("sun", 1));
//        personSet.add(new Person("li", 4));
//        System.out.println(personSet);

        // TODO
        System.out.println("aa:" + funcc());

        // TODO
        Parent parent = new Son();
        System.out.println(parent.f() + " " + parent.a);
        System.out.println(new Son().a);

    }

    static class Parent {
        int a = 100;

        public int f() {
            return 10;
        }
    }

    static class Son extends Parent {
        int a = 200;

        public int f() {
            return 20;
        }

        }

    public static int funcc() throws Exception {
        int e = 1;
        for (int i = 1; i < 2; i++) {
            try {
                throw new Exception("bb");
            } catch (Exception ex) {
                throw ex;
            } finally {
                continue;
            }
        }
        return 0;
    }

    static class Person {
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        String name;
        int age;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static int func() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public final static native int w();

    static float func1() {
        int i = 1;
        return i;
    }

    static float func2() {
        long i = 1;

        return i;
    }
}

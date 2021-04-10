package com.practice.alearn;

import java.util.*;
import java.util.regex.Pattern;

public class Base {
//    public Base(String s) {
//        System.out.println("Base");
//    }

    public static Base b1 = new Base();
    public static Base b2 = new Base();
    {
        System.out.println("构造块");
    }
    static {
        System.out.println("静态块");
    }

    public static void main(String[] args) {
        Base b = new Base();
//        System.out.println();

        // TODO
//        String strTxt = "123\\d";
//        System.out.println("strTxt=" + strTxt);
//        // regex = "\d"
//        // str1 = "456456456\d"
//        String str1 = strTxt.replaceAll("\\d", "456");
//        // Pattern.quote("\\d") = "\Q\d\E" 返回指定字符串的文字模式字符串
//        // str2 = "123456"
//        String str2 = strTxt.replaceAll(Pattern.quote("\\d"), "456");
//        // match one time from left to right
//        // str3 = "123456"
//        String str3 = strTxt.replace("\\d", "456");
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);

        // TODO 死循环
//        for (float f = (float)100000000; f < 100000010; f++) {
//            System.out.println(f);
//        }

        // TODO
//        String s1 = "[^A-Za-z0-9_]";
//        String s2 = "\\W";
//        Pattern pattern1 = Pattern.compile(s1);
//        Pattern pattern2 = Pattern.compile(s2);
//        System.out.println(pattern1.matcher("$#%^").find());
//        System.out.println(pattern1.matcher("e32fe_").find());
//
//        String s3 = "^[a-zA-Z0-9_]+@[(a-zA-Z)+.]+com$";
//        Pattern pattern3 = Pattern.compile(s3);
//        System.out.println(pattern3.matcher("abc_@host+com").find());

        // TODO
//        float f[][] = new float[][6]; // 编译报错
//        float []f[] = new float[6][];
//        System.out.println(f);

        // TODO
        System.out.println("finally test=" + func(2));

        // TODO
//        int x = 2;
//        switch (x) {
//            default:
//                x++;
//                System.out.println("default");
//            case 3:
//                x++;
//                System.out.println(x);
//                break;
//            case 4:
//                x++;
//                System.out.println(x);
//                break;
//        }

        // TODO
//        out:
//        while (true) {
//            System.out.println("while");
//            for (int i = 0; i < 3; i++) {
//                if (i == 0) {
//                    System.out.println(000000);
//                    break out;
//                }
//            }
//            System.out.println("while end");
//        }
//        System.out.println("shit");

        // TODO Comparator的使用
//        List<Dog> list= new ArrayList<>();
//        list.add(new Dog(5, "DogA"));
//        list.add(new Dog(6, "DogB"));
//        list.add(new Dog(7, "DogC"));
//        System.out.println(list);
//        Collections.sort(list, new Comparator<Dog>() {
//
//            @Override
//            public int compare(Dog o1, Dog o2) {
//                return o2.age - o1.age;
//            }
//        });
//        System.out.println(list);

        // TODO
//        TreeMap<String, String> tm = new TreeMap<>();
////        tm.put(null, "fwefe");
//        tm.put("fwef", null);
//        System.out.println(tm);

        // TODO
//        ArrayList<String> arrayList1 = new ArrayList<String>();
//        arrayList1.add(new String());
//        ArrayList<Object> arrayList2 = arrayList1; // 编译报错
//        System.out.println(arrayList2.size());

        // TODO
//        List<String> stringArrayList = new ArrayList<String>();
//        List<Integer> integerArrayList = new ArrayList<Integer>();
//        System.out.println(stringArrayList.getClass().equals(integerArrayList.getClass()));

        // TODO
//        List arrayList = new ArrayList();
//        arrayList.add("aaaa");
//        arrayList.add(100);
//        System.out.println((String)arrayList.get(1));

        // TODO
        int[] a = {100, 101, 102};
        OUTER:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.println("i=" + i + ",j=" + j);
                if (j == 1) {
                    continue OUTER;
                } else {
                    System.out.println('A');
                }
            }
            System.out.println('B');
        }
        System.out.println('C');

        List<String> list = new ArrayList<>();

        list.add("1");

        list.add("2");

        String[] array = list.toArray(new String[0]);
        System.out.println(Arrays.asList(array));
    }

    private static class Dog {
        int age;
        String name;
        Dog(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    private static int func(int i) {
        int [] nums = {1,2,3,4};
        try {
            int re = nums[i] *2;
            return re;
        } finally {
            if (i == 2) {
                return 0;
            }
        }
    }
}

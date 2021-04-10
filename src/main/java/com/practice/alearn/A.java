package com.practice.alearn;

public class A {
//    private int a;
//    protected int b;
    public int c = 4;

    public A() {
    }
    public A (String s) {
        System.out.println("A con");
    }


    public A foo () {
        return this;
    }

    public float aFun(float a, float b) {
        return a+b;
    }
    private final void run() {
        System.out.println("run A");
    }

    public int func1(int a, int b) {
        return a - b;
    }

    public void method() {
        System.out.println("base");
    }
}

package com.practice.alearn;

public class B extends A {
    public B() {
    }
    public B(String s) {
        System.out.println("B con");
    }


    public A foo () {
        return this;
    }

    // 如下代码ok，不能去掉public
//    public float aFun(float a, float b) {
//        return a+b;
//    }

    public int aFun(int a, int b) {
        return a+b;
    }

    private final void run() {
        System.out.println("run B");
    }


    public int func1(int a, int b) {
        return a + b;
    }

    public void method() {
        System.out.println("B");
    }

    public void methodB() {
        System.out.println("methodB");
    }

    public static void main(String[] args) throws Exception {
//        new B().run();

//        A a = new B();
//        B b = new B();
//        System.out.println("re a=" + a.func1(100, 50));
//        System.out.println("re b=" + b.func1(100, 50));
//
//        a.method();
//        a.methodB(); 编译报错

        new B("c");
    }
}

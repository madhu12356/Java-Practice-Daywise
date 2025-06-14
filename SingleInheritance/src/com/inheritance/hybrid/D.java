   package com.inheritance.hybrid;

    public class D extends C implements A, B {
    public void methodA() {
        System.out.println("Interface A implemented in D");
    }

    public void methodB() {
        System.out.println("Interface B implemented in D");
    }

    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
   }
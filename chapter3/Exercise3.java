package com.pyk.chapter3;

//Create a class containing a float and use it to demonstrate aliasing during
// method calls

class Box {
    float a;
}

class Exercise3 {
    static void f(Box y) {
        y.a = 2.71828f;
    }
    public static void main(String[] args) {
        Box x = new Box();
        x.a = 3.1416f;
        System.out.println("1: x.a = " + x.a);
        f(x);
        System.out.println("1: x.a = " + x.a);
    }
}
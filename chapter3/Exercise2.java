package com.pyk.chapter3;
// Create a class containing a float and use it to demonstrate aliasing

class  Tank {
    float  level;
}
public class Exercise2 {
    public static void main(String[] args) {
        Tank T1 = new Tank();
        Tank T2 = new Tank();
        T1.level = 0.4f;
        T2.level = 0.8f;
        System.out.println("T1.level=" + T1.level + "----"+"T2.level=" + T2.level);
        T1 = T2;
        System.out.println("T1.level=" + T1.level + "----"+"T2.level=" + T2.level);
    }
}

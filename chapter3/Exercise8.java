package com.pyk.chapter3;
// show the hex and octal notations work with long values.
// use Long.toBinaryString to display the results.
public class Exercise8 {
    public static void main(String[] args) {
        long l1 = 0xffff;
        long l2 = 077777;
        System.out.println("l1: "+Long.toBinaryString(l1));
        System.out.println("l2: "+Long.toBinaryString(l2));
    }
}

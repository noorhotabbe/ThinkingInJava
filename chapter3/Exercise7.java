package com.pyk.chapter3;

// Write a program that simulates coin-flipping

import java.util.Random;

public class Exercise7 {
    public static  void  main(String args[]){
        Random random = new Random();
        if (random.nextInt() % 2 == 0){
            System.out.println("heads");
        }
        else
        {
            System.out.println("tails");
        }
    }
}

package com.lesson.exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Number47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);
        int[] b = reduceAfterMax(ar);
        print(b);
    }
    static void init(int [] a, long b){
        Random rand = new Random(b);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(-3, 6);
        }
    }
    static void print (int [] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static int findMax (int [] a){
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }
    static int [] reduceAfterMax (int [] a){
        int [] b = Arrays.copyOf(a,findMax(a)+1);
        return b;
    }

}

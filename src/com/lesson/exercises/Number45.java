package com.lesson.exercises;

import java.util.Random;
import java.util.Scanner;

public class Number45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar,seed);
        print(ar);
        int ind = findMax(ar);
        System.out.println(ind);
    }
    static void init (int [] a, long b){
        Random rand = new Random(b);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(-3, 6);
        }
    }
    static void print (int [] a){
        for (int j : a) {
            System.out.print(j + " ");
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

}

package com.lesson.exercises;

import java.util.Scanner;

public class Number66 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        p(q);
    }
    static void p (int q){
        System.out.println("1");
        int [] temp1 = {1,1};
        System.out.println("1 1 ");
        for (int i = 2; i < q; i++) {
            int [] temp2 = new int[i+1];
            temp2[0] = 1;
            temp2[temp2.length-1] = 1;
            for (int j = 1; j < i ; j++) {
                temp2[j] = temp1[j-1]+temp1[j];
            }
            printMass(temp2);
            temp1 = temp2;
            System.out.println();
        }
    }
    static void printMass (int [] q){
        for (int j : q) {
            System.out.print(j + " ");
        }
    }
}

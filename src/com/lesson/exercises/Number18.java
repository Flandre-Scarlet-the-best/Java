package com.lesson.exercises;

import java.util.Scanner;

public class Number18 {
    public static void main(String[] args) {
        int high;
        int q = 0;
        Scanner scan = new Scanner(System.in);
        high = scan.nextInt();
        if (high<=0){
            System.out.println("ERROR");
            return;
        }
        for (int i = 1; i<=high; i++){
            for (int j = high; j>=i; j--){
                while (q>=1){
                    System.out.print(' ');
                    q--;
                }
                System.out.print('*');
            }
            q+=i;
            System.out.println();
        }
    }
}

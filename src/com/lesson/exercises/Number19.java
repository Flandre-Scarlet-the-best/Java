package com.lesson.exercises;

import java.util.Scanner;

public class Number19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        if (width<0) {
            System.out.println("ERROR");
            return;
        }
        int q = 0;
        int d = width;
        while (width>0){
            for (int j = 1; j <=width; j++){
                while (q>0){
                    System.out.print(' ');
                    q--;
                }
                System.out.print('x');
            }
            width -=2;
            q = (d - width)/2;
            System.out.println();
        }
    }
}

package com.lesson.exercises;

import java.util.Scanner;

public class Number30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printDivider(number);
    }
    static void printDivider (int x){
        for (int i = 1; i <= x; i++){
            if (x % i == 0 ){
                System.out.printf("%d ", i);
            }
        }
    }
}

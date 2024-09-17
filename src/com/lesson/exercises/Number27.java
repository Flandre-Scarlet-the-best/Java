package com.lesson.exercises;

import java.util.Scanner;

public class Number27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<5;i++){
            int number = scan.nextInt();
            System.out.println(isSimple(number));
        }
    }
    static boolean isSimple(int number){
        if (number<0 || number == 1 || number == 0) return (false);
        for (int i = 2; i<number;i++){
            if (number%i == 0){
                return (false);
            }
        }
        return (true);
    }
}


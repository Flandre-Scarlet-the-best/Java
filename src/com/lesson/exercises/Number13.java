package com.lesson.exercises;

import java.util.Scanner;

public class Number13 {
    public static void main(String[] args) {
        int controll;
        int number = 0;
        int x = 0;
        Scanner scan = new Scanner(System.in);
        controll = scan.nextInt();
        do{
            number = scan.nextInt();
            if(controll%number == 0 && number>0) x++;
        }while(number>0);
        System.out.println(x);
    }
}

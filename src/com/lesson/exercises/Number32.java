package com.lesson.exercises;

import java.util.Scanner;

public class Number32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String str = scan.next();
        char sim = str.charAt(0);
        pyramid(number,sim);
    }
    static void pyramid(int width, char sim){
        int number_of_sim = width % 2 == 0? 2:1;
        while (width > 0){
            int number_of_space = width % 2 == 0 ?  (width / 2)-1 : width/2 ;
            for (int i = 1; i <= number_of_sim; i++){
                while (number_of_space >0){
                    System.out.print(" ");
                    number_of_space--;
                }
                System.out.print(sim);
            }
            number_of_sim +=2;
            width -=2;
            System.out.println();
        }
    }

}

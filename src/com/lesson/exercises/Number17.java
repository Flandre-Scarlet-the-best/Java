package com.lesson.exercises;

import java.util.Scanner;

public class Number17 {
    public static void main(String[] args) {
        int height;
        int width;
        Scanner scan = new Scanner(System.in);
        height = scan.nextInt();
        width = scan.nextInt();
        if (height <= 0|| width<=0) {
            System.out.println("ERROR");
            return;
        }
        String num = " ";
        num = num.repeat(width-2);
        for (int i = 1; i<= height;i++){
             for (int j = 1; j<= width; j++){
                if (i == 1 || i == height) {
                    System.out.print('*');
                }else{
                    System.out.print('*' + num + '*');
                    break;
                }
             }
             System.out.println();
        }
    }
}

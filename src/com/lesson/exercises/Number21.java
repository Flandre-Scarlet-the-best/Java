package com.lesson.exercises;

import java.util.Scanner;

public class Number21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x>y){
            int i;
            i = x;
            x = y;
            y = i;
        }
        int z;
        int number;
        int sum_Number = 0;
        int max = 0;
        int point = 0;
        for ( int i = x; i<=y; i++){
            z = i;
            if (z<0) z=-z;
            while (z>0){
                number = z % 10;
                sum_Number += number;
                z /= 10;
            }
            if (max==0) max = sum_Number;
            if (max<sum_Number){
                max = sum_Number;
                point = i;
            }
            sum_Number = 0;
        }
        if (point == 0) point = x;
        System.out.printf("%d",point);
    }
}

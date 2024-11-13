package com.lesson.exercises;

import java.util.Scanner;
public class Number10 {
    public static void main(String[] args) {
        int x;
        int y;
        int i=0;
        double product = 1;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        int z = Math.abs(x-y);
        if (x<y){
            while (i<(z+1)){
                product *= x;
                x++;
                i++;
            }
            System.out.println(product);
            return;
        }
        if (x>y){
            while (i<(z+1)){
                product *= x;
                x--;
                i++;
            }
            System.out.println(product);
        }

    }
}

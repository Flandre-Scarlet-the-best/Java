package com.lesson.theory;

import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        int x;
        double y;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = (Math.sqrt(2)/2)*Math.sin((double) x /2+Math.PI);
        System.out.println(y);
        int z = 50 - 100;
        int w2;
        w2 = Math.abs(z);
        System.out.println(w2);
        
    }
}

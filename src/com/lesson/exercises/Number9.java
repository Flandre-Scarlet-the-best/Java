package com.lesson.exercises;

import java.util.Scanner;
public class Number9 {
    public static void main(String[] args) {
        int i = 0;
        int mark;
        int x = 0;
        Scanner scan = new Scanner(System.in);
        while (i<10){
            mark = scan.nextInt();
            if (mark<4) x++;
            i++;
        }
        System.out.println(x);

    }
}

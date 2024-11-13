package com.lesson.exercises;

import java.util.Scanner;
public class Number6 {
    public static void main(String[] args) {
        int a,b,c,d,e;
        Scanner number = new Scanner(System.in);
        a = number.nextInt();
        b = number.nextInt();
        c = number.nextInt();
        d = number.nextInt();
        e = number.nextInt();
        int min = a;
        if (b<min) min=b;
        if (c<min) min=c;
        if (d<min) min=d;
        if (e<min) min=e;
        System.out.println(min);
    }
}

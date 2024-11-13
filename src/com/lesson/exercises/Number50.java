package com.lesson.exercises;

import java.util.Scanner;

public class Number50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String st1 = scan.nextLine();
        System.out.println(st1.replace(";", ".,"));
    }
}

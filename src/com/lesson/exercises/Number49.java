package com.lesson.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Number49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str [i] = scan.nextLine();
        }
        Arrays.sort(str);
        for (String s : str) {
            System.out.println(s);
        }
    }
}

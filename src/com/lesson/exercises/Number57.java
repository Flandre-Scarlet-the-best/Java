package com.lesson.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Number57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String [] words = line.trim().split(" +");
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf('z') >= 0) words[i] = "ERROR";
        }
        StringBuffer newLine = new StringBuffer(words[0]);
        for (int i = 1; i < words.length; i++) {
            newLine.append(" ").append(words[i]);
        }
        System.out.println(newLine);
    }
}

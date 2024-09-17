package com.lesson.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Number56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String [] lineMass = line.split(" ");
        String newLine = "";
        for (int i = 0; i < lineMass.length; i++) {
            newLine += lineMass[i].substring(0,1).toUpperCase().concat(lineMass[i].substring(1));
            newLine += " ";
        }
        System.out.println(newLine);
    }
}

package com.lesson.exercises;

import java.util.Scanner;

public class Number55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String word = scan.nextLine();
        String [] lineMass = line.trim().split(" ");
        String line2 = "";
        for (String mass : lineMass) {
            if (!mass.equals(word)) {
                line2 += mass;
                line2 += " ";
            }
        }
        System.out.println(line2);
    }
}

package com.lesson.exercises;

import java.util.Scanner;

public class Number58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String [] lineMass = line.trim().split(" +");
        StringBuilder newLine = new StringBuilder(lineMass[0]);
        int q = lineMass.length-1;
        String temp = lineMass[0];
        while (q > 0) {
            for (int j = 1; j < lineMass.length; j++) {  // с чем
                if (temp.charAt(temp.length() - 1) == lineMass[j].charAt(0)) {
                    newLine.append(" ").append(lineMass[j]);
                    temp = lineMass[j];
                    lineMass = deleteValue(lineMass, j);
                    q--;
                }
            }
        }

        System.out.println(newLine);
    }
    static String[] deleteValue (String[] line,int index){
        String [] newLine = new String [line.length-1];
        for (int i = 0; i < index; i++) {
            newLine[i] = line[i];
        }
        for (int i = index; i < line.length-1; i++) {
            newLine[i] = line[i+1];
        }
        return newLine;
    }
}

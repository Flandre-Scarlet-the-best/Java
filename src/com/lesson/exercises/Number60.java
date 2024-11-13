package com.lesson.exercises;

import java.util.Scanner;

public class Number60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String [] lineMass = line.trim().split(" +");
        StringBuilder newLine = new StringBuilder();
        int sum = 0;
        int q = 0;
        for (int i = 0; i < lineMass.length; i++) {
            char [] wordMass = new char[lineMass[i].length()];
            lineMass[i].getChars(0,lineMass[i].length(),wordMass, 0);
            for (int j = 0; j < wordMass.length; j++) {
                if (wordMass[j] - '0' <= 9 && wordMass[j] - '0' >= 0){
                    newLine.append(wordMass[j]);
                    sum += wordMass[j]-'0';
                    if ((i == lineMass.length-1 || i == lineMass.length-2) && j == wordMass.length-1){

                    }
                    else {
                        newLine.append('+');
                    }
                    q++;
                }
            }
        }
        if (q==0){
            System.out.println("ERROR");
            return;
        }
        newLine.append('=').append(sum);
        System.out.println(newLine);
    }
}

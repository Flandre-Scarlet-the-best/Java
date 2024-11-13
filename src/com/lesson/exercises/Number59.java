package com.lesson.exercises;

import java.util.Scanner;

public class Number59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String str = primer(a, b);
        System.out.println(str);
    }
    static String primer (int a, int b){
        StringBuilder line = new StringBuilder();
        line.append(a).append(" + ").append(b).append(" = ").append(a+b);
        return line.toString();
    }
}

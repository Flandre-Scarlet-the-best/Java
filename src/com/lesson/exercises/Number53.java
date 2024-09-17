package com.lesson.exercises;

import java.util.Scanner;

public class Number53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (isGMailAddress(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    static boolean isGMailAddress (String a){
        String mail = "@gmail.com";
        String st3 = a.substring(a.indexOf('@'));
        return st3.equals(mail);
    }
}

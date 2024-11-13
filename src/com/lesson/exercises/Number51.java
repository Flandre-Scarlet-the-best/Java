package com.lesson.exercises;

import java.util.Scanner;

public class Number51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] st2 = new String[3];
        for (int i = 0; i < st2.length; i++) {
            String st = scan.nextLine();
            st2[i] = st.substring(st.indexOf(';')+1,st.lastIndexOf(';'));
        }
        for (String s : st2) {
            System.out.print(s);
        }
    }
}

package com.lesson.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Number54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxWord = 0;
        String st = scan.nextLine();
        st = st.trim();
        String [] st2 = st.split(" +");
        for (int i = 0; i < st2.length; i++) {
            if (st2[i].length() > st2[maxWord].length()) maxWord = i;
        }
        System.out.println(st2[maxWord]);
    }
}

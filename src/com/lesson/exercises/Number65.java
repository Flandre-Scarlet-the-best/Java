package com.lesson.exercises;

import java.util.Scanner;

public class Number65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        list(str1);
    }
    static void list (String str1){
        String [] str2 = str1.split(" +");
        StringBuilder sb = new StringBuilder();
        sb.append('[').append('\'');
        for (int i = 0; i < str2.length; i++) {
            if ( i != str2.length-1){
                if (str2[i].equals(str2[i+1])){
                    sb.append(str2[i]).append('\'').append(" ,").append('\'');
                }
                else{
                    sb.append(str2[i]).append("'], ['");
                }
                continue;
            }
            sb.append(str2[i]).append("']");
        }
        System.out.println(sb);
    }
}

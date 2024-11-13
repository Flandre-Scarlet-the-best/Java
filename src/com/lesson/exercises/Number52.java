package com.lesson.exercises;

import java.util.Scanner;

public class Number52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(delCom(str));
    }
    static String delCom (String a){
        String st1 = a.substring(a.lastIndexOf('.'));
        String com = ".com";
        if (st1.equals(com)){
            return a.substring(0,a.lastIndexOf('.'));
        }else{
            return a;
        }
    }
}

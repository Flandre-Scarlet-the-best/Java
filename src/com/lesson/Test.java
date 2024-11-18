package com.lesson;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String info = new Scanner(System.in).nextLine();
        info = info.replaceAll("[,—.:;\"]"," ").trim();
        String [] str1 = info.split("\\s+");

        for (String s : str1) {
            System.out.println(s);
        }
        System.out.println("Всего слов: " + str1.length);
    }
}

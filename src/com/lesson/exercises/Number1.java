package com.lesson.exercises;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        long income;
        float tax;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите годовой доход");
        income = scan.nextLong();
        if (income <= 5e6){
            tax = income * 0.13F;
        }
        else{
            tax = income * 0.15F;
        }
        long taxLong = (long) Math.ceil(tax);
        System.out.println("Налог составляет, " + taxLong/1000 + " т.р.  " + taxLong%1000 + "руб.");
    }
}

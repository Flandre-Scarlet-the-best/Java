package com.lesson.exercises;

import java.util.Scanner;
public class Number7 {
    public static void main(String[] args) {
        int hour;
        double perHour;
        double k = 0;
        double salary = 0;
        Scanner scan = new Scanner(System.in);
        hour = scan.nextInt();
        perHour = scan.nextDouble();
        if (hour<0||perHour<0) {
            System.out.println("ERROR");
            return;
        }
        if (hour<=20){
            salary = hour * perHour;
        }
        if (hour>20 && hour<=40){
            salary = (20*perHour) + ((hour-20)*perHour*1.5);
        }
        if (hour>40){
            salary = (20*perHour) + (20*perHour*1.5) + ((hour-40)*perHour * 2);
        }
        System.out.printf("%.2f", salary);
    }
}

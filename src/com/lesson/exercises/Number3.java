package com.lesson.exercises;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {

        double x1, y1, x2, y2, d1, d2;
        Scanner scan = new Scanner(System.in);
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        d1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        d2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        if (d1 < d2) {
            System.out.println("Первая точка ближе");
        }
        if (d1 > d2) {
            System.out.println("Вторая точка ближе");
        }
        if (d1 == d2) {
            System.out.println("Точки на равных расстояниях");
        }
    }
}

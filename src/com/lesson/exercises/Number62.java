package com.lesson.exercises;

import java.util.Scanner;

public class Number62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee rab = new Employee();
        rab.surname = scan.next();
        rab.sex = scan.next();
        rab.age = scan.nextShort();
        rab.salary = scan.nextInt();
        if (rab.isPensioner()) rab.changeSalary(0.9);
        rab.show();
        System.out.println(rab.x2salary(7892));
    }
}

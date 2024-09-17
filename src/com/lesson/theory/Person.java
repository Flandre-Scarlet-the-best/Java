package com.lesson.theory;

import java.util.Scanner;
/**
 * @author KykLa
 * @version 1.0
 */

public class Person {
    public static void main(String[] args) {
        String name;
        byte age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя и нажмите Enter");
        if (!scan.hasNextInt()){
            name = scan.nextLine();
            System.out.println("Введите возраст и нажмите Enter");
            if (scan.hasNextByte()){
                age = scan.nextByte();
                System.out.printf("Привет, %s!\nТвой возраст: %d\n", name,age);
            }
            else{
                System.out.println("Ошибка ввода возраста");
            }
        }
        else{
            System.out.println("Ошибка ввода имени");
        }
    }
}

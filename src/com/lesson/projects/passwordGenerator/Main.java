package com.lesson.projects.passwordGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер пароля. Не более 30 символов");
        PasswordGen lvlOne = new PasswordGen();
        lvlOne.currentWord = scan.nextByte();
        if (lvlOne.checkPass()) {
            System.out.println("Ошибка");
            return;
        }
        for (int i = 0; i < 10; i++) {
            lvlOne.generator();
        }

    }

}

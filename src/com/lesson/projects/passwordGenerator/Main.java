package com.lesson.projects.passwordGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FirstLevelGen passLvlOne
        System.out.println("Введите размер пароля. Не более 30 символов");
        if (checkPass()){
            System.out.println("");
        }
    }
    static boolean checkPass (){
        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt();
        if (temp>30) {
            return true;
        }
        return false;
    }
}

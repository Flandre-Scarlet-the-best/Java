package com.lesson.theory;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x; //вводимое число
        int number=0;//количество нечетных чисел
        do{
            x=scan.nextInt();
            if(x%2!=0){
                number++;
            }
        } while(x == 0);
        System.out.println(number);
    }
}

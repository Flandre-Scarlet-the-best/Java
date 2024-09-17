package com.lesson.exercises;

import java.util.Scanner;

public class Number22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x==1){
            System.out.println("NO");
            return;
        }
        int q = 0;
        for (int i = 1; i<=x;i++){
            if (x % i == 0 ){
              q++;
            }
        }
        if (q==2){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

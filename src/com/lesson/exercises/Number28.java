package com.lesson.exercises;

import java.util.Scanner;
public class Number28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int kol = simpleInRange(a, b);
        System.out.println(kol);
    }
    static int simpleInRange(int a, int b){
        int q = 0;
        if(a>b){
            int tmp;
            tmp = a;
            a = b;
            b = tmp;
        }
        a:
        for (int i = a; i<=b;i++){
            if (i<=0) continue;
            if (i == 1) continue;
            for (int j = 2; j<i;j++){
                if (i%j == 0){
                    continue a;
                }
            }
            q++;
        }
        return q;
    }
}

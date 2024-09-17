package com.lesson.theory;

import java.util.Scanner;

public class TestMetod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        System.out.println(maximum(x,y,z));
    }
    static int maximum(int first, int second, int third){
        int max = Math.max(first, second);
        max = Math.max(max, third);
        return max;
    }
}

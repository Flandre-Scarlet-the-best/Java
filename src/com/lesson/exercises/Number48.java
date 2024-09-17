package com.lesson.exercises;



import java.util.Scanner;

import static com.lesson.exercises.Number46.*;


public class Number48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        int ind = scan.nextInt();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        mas = deleteRow(mas, ind);
        printArray(mas);
    }
    static int [][] deleteRow (int [][] a, int b){
        if (b >= a.length || b<=0){
            return a;
        }
        int [][] result = new int[a.length-1][a[0].length];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                result[i][j] = a[i][j];
            }
        }
        for (int i = b; i < result.length ; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = a[i+1][j];
            }
        }
        return result;
    }
}

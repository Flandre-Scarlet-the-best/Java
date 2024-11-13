package com.lesson.exercises;

import java.util.Scanner;

public class Number8 {
    public static void main(String[] args) {
        int distance1;
        int distance2;
        int weight;
        int residue;
        double needOil = 0;
        Scanner scan = new Scanner(System.in);
        distance1 = scan.nextInt();
        distance2 = scan.nextInt();
        weight = scan.nextInt();
        if (weight <= 500){
            residue = (300 - distance1);
            if (residue<0){
                System.out.println("ERROR");
                return;
            }
            if (residue>distance2){
                System.out.printf("%.2f",needOil);
                return;
            }
            needOil = distance2 - residue;
                if(needOil>300-residue){
                    System.out.println("ERROR");
                    return;
                }
        }
        if (weight>500 && weight <= 1000){
            residue = 300 - (distance1*4);
            if (residue < 0){
                System.out.println("ERROR");
                return;
            }
            needOil = (distance2*4) - residue;
        }
        if (weight>1000 && weight<=1500){
            residue = 300 - (distance1*7);
            if (residue < 0){
                System.out.println("ERROR");
                return;
            }
            needOil = (distance2*7) - residue;
        }
        if (weight>1500 && weight<=2000){
            residue = 300 - (distance1*9);
            if (residue < 0){
                System.out.println("ERROR");
                return;
            }
            needOil = (distance2*9) - residue;
        }
        if (weight>2000){
            System.out.println("ERROR");
            return;
        }
        System.out.printf("%.2f", needOil);
    }
}

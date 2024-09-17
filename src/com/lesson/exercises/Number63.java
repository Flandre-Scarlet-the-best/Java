package com.lesson.exercises;

import java.util.Scanner;

public class Number63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BusinessTrip rab = new BusinessTrip();
        rab.fio = scan.nextLine();
        rab.day = scan.nextByte();
        rab.transportationCostsDaily = scan.nextInt();
        rab.show();
    }
}

package com.lesson.exercises;

import java.util.Scanner;

public class Number64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Commodity item = new Commodity();
        item.productName = scan.nextLine();
        item.price = scan.nextInt();
        Purchase pur = new Purchase();
        pur.quantity = scan.nextInt();
        pur.item = item;
        pur.show();
        item.price = scan.nextInt();
        pur.show();
    }
}

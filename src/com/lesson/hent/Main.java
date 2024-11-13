package com.lesson.hent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manga title1 = new Manga();
        Scanner scan = new Scanner(System.in);

        title1.setTitle(scan.nextLine());
        title1.setPage(scan.nextInt());
        title1.setSize(scan.nextDouble());
        title1.viewInform();
    }
}

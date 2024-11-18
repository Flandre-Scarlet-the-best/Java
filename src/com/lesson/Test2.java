package com.lesson;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){

        LocalDate data = LocalDate.of(2012,10,1);
        int year = data.getYear();

        System.out.println(year);
    }
}

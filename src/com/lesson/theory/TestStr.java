package com.lesson.theory;

import java.util.Arrays;

public class TestStr {
    public static void main(String[] args) {
        String st1 = "one;two;three;four;five;six;seven;eight;nine;ten";
        String [] st2 = st1.split(";");
        System.out.println(Arrays.toString(st2));
    }
}

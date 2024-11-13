package com.lesson.theory;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] mass = {1, 2, -3, 4, 25, 6, 17, -1, 9, 6};
        System.out.println(Arrays.toString(mass));
        int [] mass2 = Arrays.copyOfRange(mass,3,8);
        System.out.println(Arrays.toString(mass2));
    }
}

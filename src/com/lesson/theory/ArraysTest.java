package com.lesson.theory;

import java.util.Arrays;
import java.util.Random;


public class ArraysTest {
    public static void main(String[] args) {
     int [] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length/2;i++) {
            int temp = array[i];
            array[i] = array[array.length - (1+i)];
            array[array.length - (1+i)] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}

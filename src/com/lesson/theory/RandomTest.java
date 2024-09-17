package com.lesson.theory;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        double [] test_mass = new double [10];
        Random rand = new Random();
        for (int i = 0; i < test_mass.length; i++) {
            test_mass[i] = rand.nextDouble(-5, 5);
            System.out.printf("|%f| ", test_mass[i]);
        }
    }
}

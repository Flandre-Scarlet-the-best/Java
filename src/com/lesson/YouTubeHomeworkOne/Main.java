package com.lesson.YouTubeHomeworkOne;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        ArithmeticCalculator one = new ArithmeticCalculator(rand.nextInt(0,1000), rand.nextInt(0,1000));
        System.out.println("Первое число:  " + one.getNumberOne() + "\t\tВторое число:  " + one.getNumberTwo()
                + "\nСумма чисел:  " + one.getResult(Operation.ADD) + "\nПроизведение чисел:  "
                + one.getResult(Operation.MULTIPLY) + "\nРазность чисел:  " + one.getResult(Operation.SUBTRACT));
    }
}

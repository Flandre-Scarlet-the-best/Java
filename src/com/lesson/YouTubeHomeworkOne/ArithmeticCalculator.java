package com.lesson.YouTubeHomeworkOne;

public class ArithmeticCalculator {
    private final int numberOne;
    private final int numberTwo;
    private double result;

    public ArithmeticCalculator(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    private void calculate(Operation type) {
        switch (type) {
            case MULTIPLY:
                result = numberOne * numberTwo;
                break;
            case ADD:
                result = numberOne + numberTwo;
                break;
            case SUBTRACT:
                result = numberOne - numberTwo;
                break;
            default:
                System.out.println("Ошибка");
        }
    }
    public double getResult(Operation type) {
        calculate(type);
        return result;
    }
}

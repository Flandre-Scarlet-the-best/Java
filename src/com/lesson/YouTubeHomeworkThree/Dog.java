package com.lesson.YouTubeHomeworkThree;

public class Dog extends Animal {

    public Dog(int weight, int age, String name) {
        super(weight, age, name);
    }

    @Override
    public void move() {
        System.out.printf("Собака, по кличке %s бежит по земле\n", super.getName());
    }
}

package com.lesson.YouTubeHomeworkThree;

public class Duck extends Animal {

    public Duck(int weight, int age, String name) {
        super(weight, age, name);
    }

    @Override
    public void move() {
        System.out.printf("Утка, по кличке %s летит в облаках\n", super.getName());
    }
}

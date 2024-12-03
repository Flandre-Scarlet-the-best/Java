package com.lesson.YouTubeHomeworkThree;

public abstract class Animal {
    private int weight;
    private int age;
    private String name;


    public Animal(int weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    void walk() {
        System.out.println("Животное идёт по земле");
    }

    public abstract void move();
}

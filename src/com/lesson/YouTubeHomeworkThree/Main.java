package com.lesson.YouTubeHomeworkThree;

public class Main {
    public static void main(String[] args) {
        Animal utka = new Duck(15, 2, "Кряква");
        System.out.println("____________________________________________________________");
        utka.walk();
        utka.move();
        System.out.println("____________________________________________________________");
        Animal sobaka = new Dog(9, 5, "Патрон");
        sobaka.walk();
        sobaka.move();
        System.out.println("____________________________________________________________");
    }
}

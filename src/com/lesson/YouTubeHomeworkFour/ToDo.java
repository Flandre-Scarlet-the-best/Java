package com.lesson.YouTubeHomeworkFour;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo implements Functionality {

    List<String> toDoList = new ArrayList<>();

    @Override
    public void addToDo() {
        toDoList.add(new Scanner(System.in).nextLine());
    }

    @Override
    public void view() {
        for (String s : toDoList) {
            System.out.println(s);
        }
    }

    public void choice() {
        System.out.println("""
                \nЧто сделать:
                \t1 - Показать список
                \t2 - Добавить эелмент в список
                \t3 - Выйти из программы""");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                view();
                break;
            case 2:
                addToDo();
                break;
            case 3:
                trigger();
                break;
            default:
        }
    }

    public void trigger() {
        System.exit(0);
    }

}

package com.lesson.exercises;

public class BusinessTrip {
    final int DAILY = 25;
    String fio;
    int transportationCostsDaily;
    byte day;
    int getTotal (){
        return transportationCostsDaily + day * DAILY;
    }
    void show(){
        System.out.printf("Суточные = %d\nФамилия Имя = %s\nТранспортные расходы = %d\nКоличество дней = %d\nИтого расходы = %d",DAILY, fio, transportationCostsDaily, day, getTotal());
    }
}

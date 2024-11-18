package com.lesson.YouTubeHomeworkTwo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Wine {
    private String name;
    private String tradeMark;
    private String country;
    private String description;
    private final LocalDate dateOfBottling;


    public Wine(String name, String tradeMark, String country, String dateOfBottling, String description) {
        this.name = name;
        this.tradeMark = tradeMark;
        this.country = country;
        this.description = description;
        this.dateOfBottling = LocalDate.parse(dateOfBottling);
    }

    public LocalDate getDateOfBottling() {
        return dateOfBottling;
    }

    int excerpt (){
        Period dif = Period.between(dateOfBottling,LocalDate.now());
        return dif.getYears();
    }

    @Override
    public String toString() {
        return "Название:\t" + name + "\nМарка:\t\t" + tradeMark + "\nСтрана:\t\t" + country
                + "\nВыдержка:\t" + excerpt() + " (лет)" + "\nОписание:\t" + description;
    }
}

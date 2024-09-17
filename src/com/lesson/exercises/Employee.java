package com.lesson.exercises;

public class Employee {
    String surname;
    String sex;
    short age;
    int salary;
    boolean isPensioner(){
        if (sex.equals("male") && age>=63) return true;
        if (sex.equals("female") && age>=53) return true;
        return false;
    }
    void changeSalary(double k){
        salary *= k;
    }
    void show (){
        System.out.printf("%s;%s;%d;%d\n", surname, sex, age,salary);
    }
    int x2salary (int salary){
        return this.salary = salary*2;
    }
}

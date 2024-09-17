package com.lesson.theory;

public class ThisTest {
    public static void main(String[] args) {
        test t1 = new test();
        System.out.println(t1.squareRoot(5));
    }
}
class test{
    double number;
    double squareRoot (int number){
        return this.number =  Math.pow(number,0.5);
    }

}

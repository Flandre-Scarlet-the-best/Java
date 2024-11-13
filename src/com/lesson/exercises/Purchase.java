package com.lesson.exercises;

public class Purchase {
    Commodity item = new Commodity();
    int quantity;
    private int getCost(){
        return item.price*quantity;
    }
    void show(){
        System.out.printf("Наименование товара: %s\nЦена товара: %d\nКоличество: %d\nСтоимость покупки: %d\n\n",item.productName, item.price, quantity,getCost());
    }
}

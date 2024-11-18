package com.lesson.hent;

public class Manga {
    private String title;
    private int page;
    private double size;


    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public void setSize(double size) {
        this.size = size;
    }
    private double averageSize(int page, double size) {
        return size / page;

    }
    private double depth(double size) {
        return (averageSize(page, size) * 8388608) / (3840 * 2160);
    }

    public void viewInform(MangaType type) {
        System.out.println("_______________________________________________\n" + "Название:\t\t|"
                + title + "\nКол-во страниц:\t|" + page + "\nРазмер (мб):\t|" + size +
                "\n_______________________________________________");
        System.out.printf("Средний размер картинки: %.2f\nГлубина цвета: %.1f\n",
                averageSize(page, size), depth(size));
        System.out.println("_______________________________________________");
        System.out.println(type.getValue());
    }
//    public void wtf (MangaType type){
//        System.out.println(type.getValue());
//    }
}

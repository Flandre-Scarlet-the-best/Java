package com.lesson.hent;

public enum MangaType {
    HENTAI("Манга жанра хентай!");

    private String value;

    MangaType(String value){
    this.value = value;
    }

    public String getValue(){
        return value;
    }
}

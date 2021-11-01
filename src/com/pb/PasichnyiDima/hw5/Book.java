package com.pb.PasichnyiDima.hw5;

public class Book {
    String name;
    String author;
    int year;

    public  Book (String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }
}

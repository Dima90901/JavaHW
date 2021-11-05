package com.pb.PasichnyiDima.hw6;

public class Animal {
    private String food;
    private String location;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise () {
        System.out.println("Какое то животное издает какой то звук");
    }

    public void eat () {
        System.out.println("Какое то животное что то кушает " + food);
    }

    public void sleep () {
        System.out.println("Такое-то животное спит в месте " + location);
    }
}

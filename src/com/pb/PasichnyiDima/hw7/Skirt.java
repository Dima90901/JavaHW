package com.pb.PasichnyiDima.hw7;

public class Skirt extends Clothes implements WomenClothes {
    private String name;
    public Skirt(Size size, int cost, String color, String name) {
        super(size, cost, color);
        this.name = name;
    }

    @Override
    public void dressWomen() {
        System.out.println(name + " - женская одежда, европейский размер: " + size.getEuroSize() + ", стоимость: " + cost + " грн, цвет: " + color);
    }
}

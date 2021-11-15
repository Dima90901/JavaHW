package com.pb.PasichnyiDima.hw7;

public class Tie extends Clothes implements ManClothes {
    private String name;
    public Tie(Size size, int cost, String color, String name) {
        super(size, cost, color);
        this.name = name;
    }

    @Override
    public void dressMan() {
        System.out.println(name + " - мужская одежда, размер по описанию: " + size.getDescription() + ", стоимость: " + cost + " грн, цвет: " + color);
    }
}

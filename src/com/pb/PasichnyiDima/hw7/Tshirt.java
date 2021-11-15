package com.pb.PasichnyiDima.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
    private String name;
    public Tshirt(Size size, int cost, String color, String name) {
        super(size, cost, color);
        this.name = name;
    }

    @Override
    public void dressMan() {
        System.out.println(name + " - мужская одежда, размер: " + size + ", стоимость: " + cost + " грн, цвет: " + color);
    }

    @Override
    public void dressWomen() {
        System.out.println(name + " - женская одежда, размер: " + size + ", стоимость: " + cost + " грн, цвет: " + color);
    }
}

package com.pb.PasichnyiDima.hw7;

public class Atelier {
    public static void dressMan(Clothes[] clothes) {
        for (Clothes clothe: clothes) {
            if (clothe instanceof ManClothes) {
                ((ManClothes) clothe).dressMan();
            }
        }
    }

    public static void dressWomen(Clothes[] clothes) {
        for (Clothes clothe: clothes) {
            if (clothe instanceof WomenClothes) {
                ((WomenClothes) clothe).dressWomen();
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[] {new Pants(Size.XXS, 200, "blue", "Штаны"), new Skirt(Size.S, 150, "red", "Юбка"), new Tie(Size.L, 250, "white", "Галстук"), new Tshirt(Size.S, 140, "black", "Футболка")};
        dressMan(clothes);
        System.out.println("___________________________________________________");
        dressWomen(clothes);
    }
}

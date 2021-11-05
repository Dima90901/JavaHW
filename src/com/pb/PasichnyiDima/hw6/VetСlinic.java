package com.pb.PasichnyiDima.hw6;

public class VetСlinic {
    public static void main(String[] args) throws Exception {
        Animal[] animals = new Animal []{new Cat("Котэ", "Кошка"), new Dog("Собакен", "Собака"), new Horse("Конячка", "Конь")};
        Veterinarian veterinarian = new Veterinarian();
        for (int i = 0; i < animals.length; i++) {
            veterinarian.treatAnimal(animals[i]);
        }
    }
}

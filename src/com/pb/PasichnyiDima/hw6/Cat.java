package com.pb.PasichnyiDima.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Cat(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void makeNoise () {
        System.out.println("Животное с именем: " + name + " имеет тип: " + type + " мяукает");
    }
    @Override
    public void eat () {
        setLocation("комната 1");
        setFood("кошачий корм");
        System.out.println("Животное с именем: " + name + " имеет тип: " + type + " кушает " + getFood() + " и находится в " + getLocation());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return name.equals(cat.name) && type.equals(cat.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

package com.pb.PasichnyiDima.hw6;

import java.util.Objects;

public class Horse extends Animal {
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

    public Horse(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void makeNoise () {
        System.out.println("Животное с именем: " + name + " имеет тип: " + type + " издает звук игого");
    }
    @Override
    public void eat () {
        setLocation("комната 3");
        setFood("сено");
        System.out.println("Животное с именем: " + name + " имеет тип: " + type + " кушает " + getFood() + " и находится в " + getLocation());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(name, horse.name) && Objects.equals(type, horse.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

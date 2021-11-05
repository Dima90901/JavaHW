package com.pb.PasichnyiDima.hw6;

import java.util.Objects;

public class Dog extends Animal {
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

    public Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void makeNoise () {
        System.out.println("Животное с именем: " + name + " имеет тип: " + type + " гавкает");
    }
    @Override
    public void eat () {
        setLocation("комната 2");
        setFood("собачий корм");
        System.out.println("Животное с именем: " + name + " имеет тип: " + type + " кушает " + getFood() + " и находится в " + getLocation());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(type, dog.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

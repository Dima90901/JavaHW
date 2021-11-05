package com.pb.PasichnyiDima.hw6;

import java.lang.reflect.Constructor;

public class Veterinarian {
    public void treatAnimal(Animal animal) throws Exception {
        Class clazz = animal.getClass();

        Constructor constr = clazz.getConstructor(new Class[] {String.class, String.class});
        Object obj = constr.newInstance("", "");
        if (obj instanceof Cat) {
            obj = constr.newInstance("Рефлексионная котейка", "Рефлексионная кошка");
            ((Cat) obj).makeNoise();
            ((Cat) obj).eat();
        } else if (obj instanceof Dog) {
            obj = constr.newInstance("Рефлексионный собакен", "Рефлексионная собака");
            ((Dog) obj).makeNoise();
            ((Dog) obj).eat();
        } else if (obj instanceof Horse) {
            obj = constr.newInstance("Рефлексионная конячка", "Рефлексионный конь");
            ((Horse) obj).makeNoise();
            ((Horse) obj).eat();
        }
    }
}

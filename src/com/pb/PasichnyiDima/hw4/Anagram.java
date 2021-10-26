package com.pb.PasichnyiDima.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void checkAnagram (String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        s1 = s1.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        s2 = s2.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        char [] charS1 = s1.toCharArray();
        char [] charS2 = s2.toCharArray();
        Arrays.sort(charS1);
        Arrays.sort(charS2);
        System.out.println();
        if (Arrays.equals(charS1, charS2)) {
            System.out.println("Обе строки являются анаграммой");
        }
        else {
            System.out.println("Обе строки не являются анаграммой");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Программа, которая проверяет, являются ли две фразы анаграммами");
        System.out.println("Укажите первое предложение ниже:");
        String phrase = scan.nextLine();
        System.out.println("Укажите втророе предложение ниже:");
        String phrase2 = scan.nextLine();
        checkAnagram(phrase, phrase2);
    }
}

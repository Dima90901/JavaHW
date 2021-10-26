package com.pb.PasichnyiDima.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static String toUpperCase (String a) {
        String bufPhrase = "";
        bufPhrase = bufPhrase + a.substring(0, 1).toUpperCase();
        for (int i = 1; i <a.length(); i++) {
            if (" ".equals(a.substring(i-1, i))) {
                bufPhrase = bufPhrase + a.substring(i, i+1).toUpperCase();
            }
            else {
                bufPhrase = bufPhrase + a.substring(i, i+1);
            }
        }
        return bufPhrase;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Программа, которая переводит в словах первые буквы в заглавные");
        System.out.println("Укажите предложение ниже:");
        String phrase = scan.nextLine();
        String phraseWithUpperCase = toUpperCase(phrase);
        System.out.println(phraseWithUpperCase);
    }
}

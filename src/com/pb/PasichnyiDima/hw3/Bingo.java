package com.pb.PasichnyiDima.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(101);
        System.out.println("Добро пожаловать в игру Bingo!");
        //System.out.println(x);
        int counter = 0;
        while (true) {
            counter++;
            System.out.println("Введите число от 0 до 100, для выхода введите -1");
            int y = scan.nextInt();
            if (y == -1) {
                System.out.println("Вы вышли из игры");
                break;
            }
            if (y > x) {
                System.out.println("Вы указали число больше загаданного");
                continue;
            }
            if (y < x) {
                System.out.println("Вы указали число меньше загаднного");
                continue;
            }
            if ( y == x) {
                System.out.println("Поздравляем! Вы угадали загаданное число: " + x + " с " + counter + " попытки!");
                break;
            }
        }
    }
}

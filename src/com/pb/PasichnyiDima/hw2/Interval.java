package com.pb.PasichnyiDima.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число.");
        int operand1 = scan.nextInt();
        if (operand1 < 0) {
            System.out.println("Вы указали число меньше 0");
        }
        else if (operand1 >= 0  && operand1 <= 14) {
            System.out.println("Вы указали число от 0 до 14");
        }
        else if (operand1 >= 15 && operand1 <= 35) {
            System.out.println("Вы указали число от 15 до 35");
        }
        else if (operand1 >= 36 && operand1 <= 50) {
            System.out.println("Вы указали число от 36 до 50");
        }
        else if (operand1 >= 51 && operand1 <= 100) {
            System.out.println("Вы указали число от 51 до 100");
        }
        else if (operand1 > 100){
            System.out.println("Вы указали число больше 100");
        }
    }
}

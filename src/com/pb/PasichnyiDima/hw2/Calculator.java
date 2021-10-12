package com.pb.PasichnyiDima.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1, operand2;
        String sign;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        operand1 = scan.nextInt();
        System.out.println("Введите второе целое число");
        operand2 = scan.nextInt();
        System.out.println("Введите арифметическией знак (+ - * /)");
        sign = scan.next();
        switch (sign) {
            case ("+"):
                System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
                break;
            case ("-"):
                System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
                break;
            case ("*"):
                System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
                break;
            case ("/"):
                if (operand2 == 0) {
                    System.out.println("Деление на 0 запрещено!");
                }
                else {
                    System.out.println(operand1 + " / " + operand2 + " = " + (operand1 / operand2));
                }
                break;
            default:
                System.out.println("Вы указали не верный арифметический знак!1");
        }
    }
}

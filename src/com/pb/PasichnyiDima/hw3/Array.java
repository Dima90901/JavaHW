package com.pb.PasichnyiDima.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[10];
        int sum = 0;
        int countOfNegative = 0;
        System.out.println("Заполните массив из 10 цифр");
        for (int i = 0; i < arr.length; i++) {
            int a = scan.nextInt();
            arr[i] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Сумма всех чисел массива = " + Arrays.stream(arr).sum());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                countOfNegative++;
            }
            if (i == arr.length-1) {
                System.out.println("Количество отрицательных значений: " + countOfNegative);
            }
        }
        boolean sort = false;
        int flag;
        while (!sort) {
            sort = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    sort = false;
                    flag = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = flag;
                }
            }
        }
        System.out.println("Сортированный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

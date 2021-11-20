package com.pb.PasichnyiDima.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Auth auth = new Auth();
        Scanner scan = new Scanner(System.in);
        System.out.println("Для регистрации укажите логин от 5 до 20 символов (поддерживаются буквы и цифры) и пароль от 5 символов (поддерживаются буквы, цифры и знак нижнего подчеркивания)");
        System.out.println("Укажите логин:");
        String userLogin = scan.next();
        System.out.println("Укажите пароль:");
        String userPassword = scan.next();
        System.out.println("Подтвердите пароль:");
        String userConfirmPassword = scan.next();
        auth.signUp(userLogin, userPassword, userConfirmPassword);

        System.out.println("Для входа укажите логин:");
        String userLoginAuth = scan.next();
        System.out.println("Для входа укажите пароль:");
        String userPasswordAuth = scan.next();
        auth.signIn(userLoginAuth, userPasswordAuth);
    }
}

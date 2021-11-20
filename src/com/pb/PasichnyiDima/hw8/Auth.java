package com.pb.PasichnyiDima.hw8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Auth {
    private String login;
    private String password;

    public void signUp (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        char [] l = login.toCharArray();
        char[] p = password.toCharArray();

            if (l.length < 5) {
                throw new WrongLoginException("Длинна логина должна быть не меньше 5");
            }
            if (l.length > 20) {
                throw new WrongLoginException("Длинна логина должна быть не больше 20 символов");
            }
            for (char c: l) {
                if (!Character.isLetterOrDigit(c)) {
                    throw new WrongLoginException("Логин содержит не только буквы и цифры");
                }
            }
            if (p.length < 5) {
                throw new WrongPasswordException("Пароль должен быть более 5 символов");
            }
            for (char c: p) {
                if (!Character.isLetterOrDigit(c)) {
                    if (c == '_') {
                        continue;
                    }
                    throw new WrongPasswordException("Пароль должен содержать буквы, цифры, и знак нижнего подчеркивания");
                }
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }
            this.login = login;
            this.password = password;
            System.out.println("Вы успешно зарегистрировались");
        }

    public void signIn(String login, String password) throws WrongLoginException {
            if (this.login.equals(login) && this.password.equals(password)) {
                System.out.println("Вы успешно вошли на сайт");
            }
            else throw new WrongLoginException("Логин и пароль не совпадают");
    }
}

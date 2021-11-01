package com.pb.PasichnyiDima.hw5;

import java.util.Date;

public class Reader {
    String name;
    int ticketNumber;
    String department;
    String dateOfBirth;
    int telephoneNumber;

    public Reader (int ticket, String dep, String birth, int telephone, String name) {
        this.name = name;
        ticketNumber = ticket;
        department = dep;
        dateOfBirth = birth;
        telephoneNumber = telephone;
    }

    public void takeBook (int countOfBook) {
        System.out.println(name + " взял " + countOfBook + " книги ");
    }

    public void takeBook (String[] bookNames) {
        System.out.println(name + " взял " + " книги: ");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(" " + bookNames[i]);
        }
        System.out.println(".");
    }

    public void takeBook (Book[] bookNames) {
        System.out.print(name + " взял " + " книги: ");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(" " + bookNames[i].name + " (" + bookNames[i].author + " " + bookNames[i].year + " г.),");
        }
        System.out.println(".");
    }

    public void returnBook (int countOfBook) {
        System.out.println(name + " вернул " + countOfBook + " книги ");
    }

    public void returnBook (String[] bookNames) {
        System.out.println(name + " вернул " + " книги: ");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(" " + bookNames[i]);
        }
        System.out.println(".");
    }

    public void returnBook (Book[] bookNames) {
        System.out.print(name + " вернул " + " книги: ");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(" " + bookNames[i].name + " (" + bookNames[i].author + " " + bookNames[i].year + " г.),");
        }
        System.out.print(".");
        System.out.println();
    }
}

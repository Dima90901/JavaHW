package com.pb.PasichnyiDima.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book [3];
        books[0] = new Book ("Приключения", "Иванов И. И.", 2000);
        books[1] = new Book ("Энциклопедия", "Петров П. К.", 1990);
        books[2] = new Book ("Словарь", "Сидоров А. В", 2001);

        Reader[] readers = new Reader[3];
        readers[0] = new Reader(1, "Математический", "01.05.1995", 991234567, "Кошкин В. Л.");
        readers[1] = new Reader(2, "Механический", "10.09.1996", 501234568, "Собачкин П. Г.");
        readers[2] = new Reader(3, "Математический", "21.11.1997", 631234569, "Лисичкина Н. К.");

        System.out.println("В библиотеке есть следющие книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.println("название - " + books[i].name + ", автор - " + books[i].author + ", год - " + books[i].year + ".");
        }
        System.out.println();

        System.out.println("В библиотеке присутствуют следющие читатели: ");
        for (int i = 0; i < readers.length; i++) {
            System.out.println("ФИО - " + readers[i].name + ", билет - " + readers[i].ticketNumber + ", факультет - " + readers[i].department + ", дата рождения - " + readers[i].dateOfBirth + ", телефон - 380" + readers[i].telephoneNumber + ".");
        }
        System.out.println();

        readers[0].returnBook(2);
        readers[1].returnBook(books);

        String [] bookNameArr = new String[books.length];
        for (int i = 0; i < bookNameArr.length; i++) {
            bookNameArr[i] = books[i].getName();
        }

        readers[2].returnBook(bookNameArr);

        readers[0].takeBook(3);
        readers[1].takeBook(books);
        readers[2].takeBook(bookNameArr);
    }
}

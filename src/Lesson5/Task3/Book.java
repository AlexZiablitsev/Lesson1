package Lesson5.Task3;

import Lesson5.Task2.GenerateId;

public class Book {
    //Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена.
    //Создать массив объектов. Вывести:
    //a) список книг заданного автора;
    //b) список книг, выпущенных заданным издательством;
    //c) список книг, выпущенных после заданного года
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int amountPages;
    private float price;

    public Book(String name, String author, String publisher, int year, int amountPages, float price) {
        this.id = GenerateId.newId();
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.amountPages = amountPages;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmountPages() {
        return amountPages;
    }

    public float getPrice() {
        return price;
    }

    public void pritnBook() {
        String fullInfo = String.format("ID: %s,\nAuthor: %s,\nPublisher: %s," +
                "\nYear: %s,\nPages: %s,\nPrice: %s.", getId(), getAuthor(), getPublisher(), getYear(), getAmountPages(), getPrice());
        System.out.println(fullInfo);
    }
}

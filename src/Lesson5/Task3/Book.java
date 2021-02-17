package Lesson5.Task3;

public class Book {
    //Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена.
    //Создать массив объектов. Вывести:
    //a) список книг заданного автора;
    //b) список книг, выпущенных заданным издательством;
    //c) список книг, выпущенных после заданного года
    private int id;
    private static int ID = 1;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int amountPages;
    private float price;

    public Book(String name, String author, String publisher, int year, int amountPages, float price) {
        this.id = ID++;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.amountPages = amountPages;
        this.price = price;
    }

    public void pritnBook() {
        String fullInfo = String.format("ID: %s,\nAuthor: %s,\nPublisher: %s," +
                "\nYear: %s,\nPages: %s,\nPrice: %s.", id, author, publisher, year, amountPages, price);
        System.out.println(fullInfo);
    }

    public void printAuthor(String a) {
        if (author.compareTo(a) == 0) {
            pritnBook();
        }
    }

    public void printPublisher(String a) {
        if (publisher.compareTo(a) == 0) {
            pritnBook();
        }
    }

    public void printYear(int a) {
        if (year >= a) {
            pritnBook();
        }
    }
}

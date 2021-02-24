package Lesson5.Task3;

public class Main {
    public static void main(String[] args) {
        //Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена.
        //Создать массив объектов. Вывести:
        //a) список книг заданного автора;
        //b) список книг, выпущенных заданным издательством;
        //c) список книг, выпущенных после заданного года
        int n = 0;
        Book bookList[] = new Book[4];

        Book book1 = new Book("Тарзан: Возвращение в джунгли", "Эдгар Берроуз", "Государственное малое предприятие \"Гарт\"", 1990, 210, 99f);
        Book book2 = new Book("Тарзан и его звери, Сын Тарзана", "Эдгар Берроуз", "ACT", 2014, 185, 100f);
        Book book3 = new Book("Толковый словарь русского языка", "С.И. Ожегов и Н.Ю. Шведова", "Азбуковник", 2001, 940, 514.88f);
        Book book4 = new Book("Меня называли Лихим Полковником. Воспоминания", "Давид Альфаро Сикейрос",
                "Государственное издательство политической литературы", 1986, 416, 184f);
        bookList[0] = book1;//чет не могу додуматься как автоматом вносить их в массив
        bookList[1] = book2;
        bookList[2] = book3;
        bookList[3] = book4;

        Book[] findBookByAuthor = BookService.findByAuthor(bookList, "Дави Альфаро Сикейрос"); //a) список книг заданного автора;

        for (Book book : findBookByAuthor) {
            book.pritnBook();
        }
        Book[] findBookByPublisher = BookService.findByPublisher(bookList, "Азбуковник"); //b) список книг, выпущенных заданным издательством;
        for(Book book : findBookByPublisher){
            book.pritnBook();
        }

        Book[] findBookByYear = BookService.findByYear(bookList, 2010);  //c) список книг, выпущенных после заданного года
        for(Book book : findBookByYear){
            book.pritnBook();
        }
    }
}

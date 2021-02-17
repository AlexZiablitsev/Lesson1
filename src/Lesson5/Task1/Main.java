package Lesson5.Task1;

public class Main {
    public static void main(String[] args) {
        //Создать класс и объекты описывающие промежуток времени. Сам промежуток
        //в классе должен задаваться тремя свойствами: секундами, минутами, часами.
        //Сделать методы для получения полного количества секунд в объекте, сравнения
        //двух объектов. Создать
        //два конструктора: получающий общее количество секунд, и часы, минуты и секунды
        //по отдельности. Сделать метод для вывода данных.
        TimePeriod time1 = new TimePeriod(35);
        TimePeriod time2 = new TimePeriod(10, 8, 12);
        time1.printHoursMinutesSeconds();
        time2.printAllsec();
        System.out.println(time1.compareTo(time2));
    }
}

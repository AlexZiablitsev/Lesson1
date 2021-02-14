package Lesson5.Task1;

import java.util.Objects;

public class TimePeriod {
    //    Создать класс и объекты описывающие промежуток времени. Сам промежуток
//    в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//    Сделать методы для получения полного количества секунд в объекте, сравнения
//    двух объектов. Создать
//    два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//    по отдельности. Сделать метод для вывода данных.
    int seconds;
    int minutes;
    int hours;
    String equel = "They are equals.";
    String greater = "The first compared period is greater than the second.";
    String smaller = "The second compared period is greater than the first.";

    public TimePeriod(int onlySecond) { // конструктор для только секунд
        this.seconds = onlySecond;
    }

    public TimePeriod(int hours, int minutes, int seconds) { // конструктор для часов, минут, секунд
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int AllSeconds() { // считаем секунды
        return hours * 3600 + minutes * 60 + seconds;
    }

    public void PrintAllsec() { // вывод всех секунд
        System.out.println(String.format("Priod have %s second(s).", AllSeconds()));
    }

    public void PrintHoursMinutesSeconds() { // вывод часов, минут, секунд
        System.out.println(String.format("Period have %s hour(s), %s minute(s), %s second(s)", hours, minutes, seconds));
    }

    public String compare(TimePeriod period) {// самый сложный метод был
        String result = "";
        int firstObject = AllSeconds();
        int secondObject = period.AllSeconds();
        result = String.format("%s", firstObject == secondObject ? equel // по совету ввел переменные, ибо строка огромная была
                : firstObject > secondObject ? greater
                : smaller);
        return result;
    }
}


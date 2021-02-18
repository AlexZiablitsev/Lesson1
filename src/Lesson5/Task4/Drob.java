package Lesson5.Task4;

public class Drob {
    //Реализовать методы сложения, вычитания, умножения и деления объектов.
    //Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
    //Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей. Создать массив объектов
    // и передать его в метод, который изменяет каждый элемент массива с четным
    //индексом путем добавления следующего за ним элемента.
    protected int chislitel;
    protected int znamenatel;
    protected float drobracional;

    protected Drob(int chislitel, int znamenatel) {
        this.chislitel = chislitel;
        this.znamenatel = znamenatel;
        this.drobracional = (float) chislitel / znamenatel;
    }

    protected void print() {
        System.out.println(String.format("%s/%s", chislitel, znamenatel));
    }

    protected void addition(Drob b) {
        chislitel = chislitel * b.znamenatel + b.chislitel * znamenatel;
        znamenatel = znamenatel * b.znamenatel;
        format();
    }

    protected void subtraction(Drob b) {
        chislitel = chislitel * b.znamenatel - b.chislitel * znamenatel;
        znamenatel = znamenatel * b.znamenatel;
        format();
    }

    protected void multiplication(Drob b) {
        chislitel = chislitel * b.chislitel;
        znamenatel = znamenatel * b.znamenatel;
    }

    protected void division(Drob b) {
        chislitel = chislitel * b.znamenatel;
        znamenatel = znamenatel * b.chislitel;
        format();
    }

    private void format() {
        int min = chislitel < znamenatel ? chislitel : znamenatel;
        for (int i = min; i > 1; i--) {
            if ((chislitel % i == 0) && (znamenatel % i == 0)) {
                chislitel = chislitel / i;
                znamenatel = znamenatel / i;
            }
        }
    }
}

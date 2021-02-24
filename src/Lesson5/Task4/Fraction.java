package Lesson5.Task4;

public class Fraction {
    //Реализовать методы сложения, вычитания, умножения и деления объектов.
    //Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
    //Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей. Создать массив объектов
    // и передать его в метод, который изменяет каждый элемент массива с четным
    //индексом путем добавления следующего за ним элемента.
    private int numerator;
    private int denominator;


    public Fraction(int numerator, int znamenatel) {
        this.numerator = numerator;
        this.denominator = znamenatel;
        if (znamenatel == 0) {
            throw new IllegalArgumentException("Знаменатель не должен ровняться нулю.");
        }
    }

    public int getChislitel() {
        return numerator;
    }

    public int getZnamenatel() {
        return denominator;
    }

    public void print() {
        System.out.println(String.format("%s/%s", numerator, denominator));
    }

    protected Fraction addition(Fraction b) {
        numerator = numerator * b.denominator + b.numerator * denominator;
        denominator = denominator * b.denominator;
        Fraction c = format();
        return c;
    }

    protected Fraction subtraction(Fraction b) {
        numerator = numerator * b.denominator - b.numerator * denominator;
        denominator = denominator * b.denominator;
        Fraction c = format();
        return c;
    }

    protected Fraction multiplication(Fraction b) {
        numerator = numerator * b.numerator;
        denominator = denominator * b.denominator;
        Fraction c = format();
        return c;
    }

    protected Fraction division(Fraction b) {
        numerator = numerator * b.denominator;
        denominator = denominator * b.numerator;
        Fraction c = format();
        return c;
    }

    protected Fraction format() {
        int min = Math.min(numerator, denominator);
        Fraction fraction = new Fraction(getChislitel(), getZnamenatel());
        for (int i = min; i > 1; i--) {
            if ((fraction.numerator % i == 0) && (fraction.denominator % i == 0)) {
                Fraction fraction1 = fraction;
                fraction1.numerator = fraction.numerator / i;
                fraction1.denominator = fraction.denominator / i;
                fraction = fraction1;
                numerator = fraction1.numerator;
                denominator = fraction1.denominator;
            }
        }
        return fraction;
    }
}

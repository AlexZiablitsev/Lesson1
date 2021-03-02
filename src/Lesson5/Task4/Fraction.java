package Lesson5.Task4;

public class Fraction {
    //Реализовать методы сложения, вычитания, умножения и деления объектов.
    //Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
    //Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей. Создать массив объектов
    // и передать его в метод, который изменяет каждый элемент массива с четным
    //индексом путем добавления следующего за ним элемента.
    private int numerator;
    private int denominator;


    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не должен ровняться нулю.");
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void print() {
        System.out.println(String.format("%s/%s", getNumerator(), getDenominator()));
    }

    protected Fraction addition(Fraction b) {
        Fraction c = new Fraction(1, 1);
        c.numerator = this.numerator * b.denominator + b.numerator * this.denominator;
        c.denominator = this.denominator * b.denominator;
        c.format();
        return c;
    }

    protected Fraction subtraction(Fraction b) {
        Fraction c = new Fraction(1, 1);
        c.numerator = this.numerator * b.denominator - b.numerator * this.denominator;
        c.denominator = this.denominator * b.denominator;
        c.format();
        return c;
    }

    protected Fraction multiplication(Fraction b) {
        Fraction c = new Fraction(1, 1);
        c.numerator = this.numerator * b.numerator;
        c.denominator = this.denominator * b.denominator;
        c.format();
        return c;
    }

    protected Fraction division(Fraction b) {
        Fraction c = new Fraction(1, 1);
        c.numerator = this.numerator * b.denominator;
        c.denominator = this.denominator * b.numerator;
        c.format();
        return c;
    }

    protected Fraction format() {
        int min = Math.min(this.numerator, this.denominator);
        Fraction fraction = new Fraction(getNumerator(), getDenominator());
        for (int i = min; i > 1; i--) {
            if ((fraction.numerator % i == 0) && (fraction.denominator % i == 0)) {
                Fraction fraction1 = fraction;
                fraction1.numerator = fraction.numerator / i;
                fraction1.denominator = fraction.denominator / i;
                fraction = fraction1;
                this.numerator = fraction1.numerator;
                this.denominator = fraction1.denominator;
            }
        }
        return fraction;
    }
}

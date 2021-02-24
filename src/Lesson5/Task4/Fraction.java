package Lesson5.Task4;

public class Fraction {
    //Реализовать методы сложения, вычитания, умножения и деления объектов.
    //Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
    //Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей. Создать массив объектов
    // и передать его в метод, который изменяет каждый элемент массива с четным
    //индексом путем добавления следующего за ним элемента.
    private int chislitel;
    private int znamenatel;


    public Fraction(int chislitel, int znamenatel) {
        this.chislitel = chislitel;
        this.znamenatel = znamenatel;
        if (znamenatel == 0) {
            throw new IllegalArgumentException("Знаменатель не должен ровняться нулю.");
        }
    }

    public int getChislitel() {
        return chislitel;
    }

    public int getZnamenatel() {
        return znamenatel;
    }

    public void print() {
        System.out.println(String.format("%s/%s", chislitel, znamenatel));
    }

    protected Fraction addition(Fraction b) {
        chislitel = chislitel * b.znamenatel + b.chislitel * znamenatel;
        znamenatel = znamenatel * b.znamenatel;
        Fraction c = format();
        return c;
    }

    protected Fraction subtraction(Fraction b) {
        chislitel = chislitel * b.znamenatel - b.chislitel * znamenatel;
        znamenatel = znamenatel * b.znamenatel;
        Fraction c = format();
        return c;
    }

    protected Fraction multiplication(Fraction b) {
        chislitel = chislitel * b.chislitel;
        znamenatel = znamenatel * b.znamenatel;
        Fraction c = format();
        return c;
    }

    protected Fraction division(Fraction b) {
        chislitel = chislitel * b.znamenatel;
        znamenatel = znamenatel * b.chislitel;
        Fraction c = format();
        return c;
    }

    protected Fraction format() {
        int min = Math.min(chislitel, znamenatel);
        Fraction fraction = new Fraction(getChislitel(), getZnamenatel());
        for (int i = min; i > 1; i--) {
            if ((fraction.chislitel % i == 0) && (fraction.znamenatel % i == 0)) {
                Fraction fraction1 = fraction;
                fraction1.chislitel = fraction.chislitel / i;
                fraction1.znamenatel = fraction.znamenatel / i;
                fraction = fraction1;
                chislitel = fraction1.chislitel;
                znamenatel = fraction1.znamenatel;
            }
        }
        return fraction;
    }
}

package Lesson5.Task4;

public class Main {
    //Реализовать методы сложения, вычитания, умножения и деления объектов.
    //Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
    //Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей.
    // Создать массив объектов и передать его в метод, который изменяет каждый элемент массива с четным
    //индексом путем добавления следующего за ним элемента.
    public static void main(String[] args) throws Exception {
        //Первый массив
        Fraction[] array = new Fraction[0];

        try {
            array = new Fraction[]{
                    new Fraction(3, 7),
                    new Fraction(4, 6),
                    new Fraction(2, 6),
                    new Fraction(1, 8),
                    new Fraction(2, 8)
            };
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        //Второй массив на случай если нужен будет первый массив
        Fraction[] array1 = new Fraction[array.length];
        System.arraycopy(array, 0, array1, 0, array.length);

        // изменение четных элементов
        for (int i = 1; i + 1 < array1.length; i += 2) {
            array1[i] = array1[i].addition(array1[i + 1]);
        }

        //Вывод массивов
        for (Fraction fraction : array) fraction.print();
        System.out.println("\n");
        for (Fraction fraction : array1) fraction.print();

    }

}

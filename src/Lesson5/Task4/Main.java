package Lesson5.Task4;

public class Main {
    //Реализовать методы сложения, вычитания, умножения и деления объектов.
    //Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
    //Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей.
    // Создать массив объектов и передать его в метод, который изменяет каждый элемент массива с четным
    //индексом путем добавления следующего за ним элемента.
    public static void main(String[] args) {
        //Первый массив
        Drob[] array = new Drob[]{
                new Drob(3, 7),
                new Drob(4, 6),
                new Drob(2, 6),
                new Drob(1, 8)
        };

        //Второй массив на случай если нужен будет первый массив
        Drob[] array1 = new Drob[4];
        for (int i = 0; i <= array1.length - 1; i++) {
            array1[i] = new Drob(array[i].chislitel, array[i].znamenatel);
        }
        // изменение четных элементов
        for (int i = 1; i + 1 < array1.length; i += 2) {
            array1[i].addition(array1[i + 1]);
        }
        //Вывод массивов
        for (int i = 0; i < array.length; i++) array[i].print();
        System.out.println("\n");
        for (int i = 0; i < array1.length; i++) array1[i].print();

    }

}

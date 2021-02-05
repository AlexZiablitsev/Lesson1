package Lesson3.Exercise1;

import java.util.Random;


public class Exercise1 {
    public static void main(String[] args) {
        //Найти максимальный элемент в массиве заданной длинны.

        int n = 10;
        int[] array = new int[n];
        for (int a = 0; a < array.length; a++) {
            array[a] = (int) (Math.random() * 50);
            System.out.print(array[a] + " ");// Вывожу массив чтобы было понятнее какие числа в нем
        }
        int max = 0;
        for (int a = 0; a < array.length; a++) {
            if (array[a] > max) {
                max = array[a];
            }
        }
        System.out.println("\n" + max);
    }
}

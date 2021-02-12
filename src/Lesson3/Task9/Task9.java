package Lesson3.Task9;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        //Реализовать бинарный поиск в массиве.
        int num = 7;
        int array[] = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(array);// сортировка
        int searchIndex = 3; // задаем какое число искать
        int firstIndex = 0; // границы первого поиска
        int lastIndex = num - 1; // границы первого поиска
        System.out.println(Arrays.toString(array)); // посмотреть что в массиве
        int middle = (firstIndex + lastIndex) / 2;// находим середину
        while ((array[middle] != searchIndex) && (firstIndex <= lastIndex)) { //условия для резки лишнего куска массива
            if (array[middle] > searchIndex) {// установка новых границ поиска
                lastIndex = middle - 1;
            } else {
                firstIndex = middle + 1;
            }
            middle = (firstIndex + lastIndex)/2; // середина для новых границ
        }
            if (firstIndex <= lastIndex) {
                System.out.println(searchIndex + " является " + middle + " элементом массива.");
            } else {
                System.out.println("Искомое число не найдено.");
            }
    }
}

package Lesson4.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Найти сумму элементов на главной диагонали матрицы n*n. Число n задается пользователем.
        Scanner inNum = new Scanner(System.in);
        System.out.println("Введите число 'n': ");
        int num = inNum.nextInt();
        int array[][] = new int[num][num];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == i) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}

package Lesson4.Task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
        //таким образом:
        //1 1 1 1 1
        //0 1 1 1 0
        //0 0 1 0 0
        //0 1 1 1 0
        //1 1 1 1 1
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - i; j++) {
                if (j < i) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = array.length - 1; i > array.length / 2 -1; i--) { // при четных не ститало правильно, пришлось подняться на одну строку выше
            for (int j = 0; j < array[i].length; j++) {
                if ((j < array[i].length - 1 - i) || j > i) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
    }
}

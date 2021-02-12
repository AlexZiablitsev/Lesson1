package Lesson3.Task8;

public class Task8 {
    public static void main(String[] args) {
        //Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
        int lengthArray = 15;
        int array[] = new int[lengthArray];
        int factorial = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            if (array[i] >= 10 && array[i] <= 15) {
                factorial = factorial * array[i];
            }
        }
        System.out.println(factorial);
    }
}

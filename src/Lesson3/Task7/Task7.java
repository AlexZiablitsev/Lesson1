package Lesson3.Task7;

public class Task7 {
    public static void main(String[] args) {
        //Определите сумму элементов одномерного массива, расположенных между
        //минимальным и максимальным значениями.
        int lengthArray = 10;
        int array[] = new int[lengthArray];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            sum+=array[i];
        }
        System.out.println(sum);
    }
}

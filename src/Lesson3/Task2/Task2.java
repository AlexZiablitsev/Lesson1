package Lesson3.Task2;

public class Task2 {
    public static void main(String[] args) {
        //Упорядочить и вывести числа в порядке возрастания (убывания) значений
        //их длины.
        int array[] = new int[10];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int k = 0; k < array.length - 1; k++) {
                int tmp = 0;
                if (array[k] > array[k + 1]) { //Для убывания поменять знак " > " на " < "
                    tmp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }
}

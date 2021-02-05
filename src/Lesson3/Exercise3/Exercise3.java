package Lesson3.Exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        //Вычислить: 1+2+4+8+…+256
        int line = 256;
        int array[] = new int[line];
        for (int index = 0; index < array.length; index++) {
            array[index] = index + 1;
        }
        int sum = 0;
        for (int a = 0; a < array.length; a++) {
            sum = sum + array[a];
        }
        System.out.println("Sum: " + sum);
    }
}

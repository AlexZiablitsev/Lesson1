package Lesson3.Exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        //Вычислить: 1+2+4+8+…+256
        int line = 256;
        int sum = 0;
        for (int a = 1; a <= line; a++) {
            sum = sum + a;
        }
        System.out.println("Sum: " + sum);
    }
}

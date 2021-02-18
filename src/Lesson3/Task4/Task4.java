package Lesson3.Task4;

public class Task4 {
    public static void main(String[] args) {
        //Составьте программу, вычисляющую A*B, не пользуясь операцией
        //умножения.
        int a = -3;
        int b = 5;
        int moduleA = Math.abs(a);
        int moduleB = Math.abs(b);

        int result = 0;
        for (int i = 1; i <= moduleB; i++) {
            result = result + moduleA;
        }
        if (a < 0 && b > 0 || a > 0 && b < 0) {
            result = Math.negateExact(result);
        }
        System.out.println(result);
    }
}

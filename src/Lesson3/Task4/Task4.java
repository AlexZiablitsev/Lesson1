package Lesson3.Task4;

public class Task4 {
    public static void main(String[] args) {
        //Составьте программу, вычисляющую A*B, не пользуясь операцией
        //умножения.
        int a = 2;
        int b = -2;
        int moduleA = Math.abs(a);
        int moduleB = Math.abs(b);
        // A & B > 0
        int result = 0;
        if (a > 0 && b > 0 || moduleA > 0 & moduleB > 0) {
            for (int i = 1; i <= b; i++) {
                result = result + a;
            }
        }
        // A > 0 & B < 0
        if (a > 0 && b < 0) {
            for (int i = -1; i >= b; i--) {
                result = result - a;
            }
        }
        // A & B < 0
        if (a < 0 && b < 0) {
            for (int i = -1; i >= b; i--) {
                result = result - a;
            }
        }
        System.out.println(result);
    }
}

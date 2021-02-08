package Lesson1.Ex4;

public class Ex4 {
    public static void main(String[] args) {
        //Первый способ
        int num = 9761;
        int num4 = num / 1000;
        int num3 = num / 100 % 10;
        int num2 = num / 10 % 10;
        int num1 = num % 10;
        System.out.print(num1);
        System.out.print(num2);
        System.out.print(num3);
        System.out.println(num4);

        //Второй способ
        StringBuilder b = new StringBuilder("8965");
        b = b.reverse(); // используем StringBuilder для переворота строки

        System.out.println(b);

    }
}

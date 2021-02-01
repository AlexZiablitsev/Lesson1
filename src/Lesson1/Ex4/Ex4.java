package Lesson1.Ex4;

public class Ex4 {
    public static void main(String[] args) {
        //Первый способ
        int a = 9761;
        int c = a/1000;
        int d = a/100%10;
        int e = a/10%10;
        int f = a%10;
        System.out.print(f);
        System.out.print(e);
        System.out.print(d);
        System.out.println(c);

        //Второй способ
        StringBuilder b = new StringBuilder("8965");
        b=b.reverse(); // используем StringBuilder для переворота строки

        System.out.println(b);

    }
}

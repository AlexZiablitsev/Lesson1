package Lesson2.Exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        //Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
        //различны?
        int num = 8571;
        int s = (int) Math.log10(num) + 1;
        int array[] = new int[s];
        for (int a = 0; a < array.length; a++) {
            array[a] = num % 10;
            num = num / 10;
        }
        for (int s1 = 0; s1 < array.length - 1; s1++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int mem = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = mem;
                }
            }
        }
        if (array[0] != array[1]) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }
    }
}

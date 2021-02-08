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

        boolean flag = true;
        out:for (int a = 0; a < array.length; a++) {
            for (int i = a + 1; i < array.length; i++) {
                if (array[a] == array[i]) {
                    flag = false;
                    break out;
                }
            }
        }
        if (flag == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}

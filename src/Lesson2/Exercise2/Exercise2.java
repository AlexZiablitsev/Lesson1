package Lesson2.Exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        //Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
        //различны?
        int num = 857155236;
        int s = (int) Math.log10(num) + 1;
        int array[] = new int[s];
        int temp = num;
        for (int a = 0; a < array.length; a++) {
            array[a] = (int) (temp / Math.pow(10, s - 1));
            temp = (int) (temp % Math.pow(10, s - 1));
            s--;
        }
        //First variant
        boolean flag = true;
        out:
        for (int a = 0; a < array.length; a++) {
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

        // Second variant
        int a = 0;
        boolean flag1 = true;
        while (a < array.length && flag1) {
            for (int i = a + 1; i < array.length; i++) {
                if (array[a] == array[i]) {
                    flag1 = false;
                    break;
                }
            }
            a++;
        }
        if (flag1 == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

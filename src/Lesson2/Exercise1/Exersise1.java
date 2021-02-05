package Lesson2.Exercise1;

public class Exersise1 {
    public static void main(String[] args) {
        //Определить число, полученное выписыванием в обратном порядке цифр
        //любого 4-х значного натурального числа n.
        int num = 9761;
        int s = (int) Math.log10(num) + 1;
        int temp = num;
        for (int a = 0; a < s; a++) {
            int ost = temp % 10;
            System.out.print(ost);
            temp = temp / 10;
        }
        System.out.println('\n');
        // Через массив
        int array[] = new int[s];
        int $temp = num;
        for (int a = 0; a < array.length; a++) {
            array[a] = $temp % 10;
            System.out.print(array[a]);
            $temp = $temp / 10;
        }
    }
}
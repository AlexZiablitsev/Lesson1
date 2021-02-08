package Lesson2.Exercise1;

public class Exersise1 {
    public static void main(String[] args) {
        //Определить число, полученное выписыванием в обратном порядке цифр
        //любого 4-х значного натурального числа n.
        int num = 9761;
        int s = (int) Math.log10(num) + 1;
        for (int a = 0; a < s; a++) {        //через  for вышло меньше строчек писать
           int ost = num % 10;
            System.out.print(ost);
            num = num / 10;
        }
        // Через массив
        int array[] = new int[s];
        for (int a = 0; a < s; a++) {
            array[a] = num % 10;
            System.out.print(array[a]);
            num = num / 10;
        }
    }
}
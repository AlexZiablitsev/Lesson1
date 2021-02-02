package Lesson1.Ex6;

public class Ex6 {
    public static void main(String[] args) {
        /*Создайте число. Определите, является ли число трехзначным. Определите, является
        ли его последняя цифра семеркой. Определите, является ли число четным.*/
        int num = -337;

        int module = Math.abs(num);
        int s = (int) Math.log10(module) + 1;
        if (s == 3) {
            System.out.println("Является трех значным числом.");//уточнить про дробные числа
        } else {
            System.out.println("Не является трех значным числом.");
        }
        if (module % 10 == 7) {
            System.out.println("Последняя цифра является 7.");
        } else {
            System.out.println("Последняя цифра не является 7.");
        }
        if (num % 2 == 0) {
            System.out.println("Число является четным.");
        } else {
            System.out.println("Число является не четным");
        }
    }
}
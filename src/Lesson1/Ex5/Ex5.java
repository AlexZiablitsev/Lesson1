package Lesson1.Ex5;

import static java.lang.System.*;

public class Ex5 {
    public static void main(String[] args) {
        //Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
        //различны?
       int num = 8541;

       int a = num/1000;
       int b = num/100 %10;
       int c = num/10%10;
       int d = num%10;

       if ((a!=b) & (a!=c) & (a!=d) & (b!=a) & (b!=c) & (b!=d)){
           System.out.println("Верно");}
       else {
           out.println("Не верно");
       }
    }
}

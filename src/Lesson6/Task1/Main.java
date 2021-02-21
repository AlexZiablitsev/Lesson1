package Lesson6.Task1;

import java.util.Arrays;

public class Main {
    //Реализовать интерфейс MySuperArray
    public static void main(String[] args) {

        List array = new List();
        array.addElement(5);
        array.addElement(6);
        array.addElement(1);
        array.addElement(7);

        System.out.println(array.getLength());
        System.out.println(array.getElement(2));
        System.out.println(Arrays.toString(array.getAllElements()));
        array.removeAllElements();
        System.out.println("\n" + Arrays.toString(array.getAllElements()));

    }
}

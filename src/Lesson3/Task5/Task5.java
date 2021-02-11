package Lesson3.Task5;

public class Task5 {
    public static void main(String[] args) {
        //Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
        //сколько амеб будет через 3, 6, 9, 12,..., 24 часа
        int amoeba = 1;
        int hours = 24;
        int array[] = new int[hours];
        int countHours = 0;
        int countAmoebas = amoeba;
        for (int i = 1; i <= hours; i++) {
            countHours =i;
            if (i % 3 == 0) {
                countAmoebas = countAmoebas * 2;
                System.out.println("In " + countHours + " hours there will be " + countAmoebas + " amoebas.");
            }
        }
        System.out.println("\n"+"In " + hours + " hour(s) there will be " + countAmoebas + " amoebas.");//Выводит количество амеб в точное время.
    }
}

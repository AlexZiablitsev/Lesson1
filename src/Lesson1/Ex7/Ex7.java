package Lesson1.Ex7;

public class Ex7 {
    public static void main(String[] args) {
        /*меется прямоугольное отверстие размерами a и b, определить, можно ли его
        полностью закрыть круглой картонкой радиусом r.*/
        double sideA = 10, sideB = 7.5, radius = 3;
        double diameter = 2*radius;
        double hypotenuse = Math.sqrt((Math.pow(sideA, 2))+(Math.pow(sideB, 2)));

        if (hypotenuse<=diameter){
            System.out.println("Картонка закроет отверстие");
        }else {
            System.out.println("Картонка не закроет отверстие");
        }
    }
}

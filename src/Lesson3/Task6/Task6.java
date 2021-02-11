package Lesson3.Task6;

public class Task6 {
    public static void main(String[] args) {
        //Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
        //день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
        //суммарный путь пробежит спортсмен за 7 дней?
        float length = 10;
        int days= 7;
        float array[] = new float[days];
        float sumLength = length;
        array[0] = length;
        for( int i = 1; i < array.length;i++){
            array[i]=array[i-1]+(array[i-1]/10);
            sumLength = sumLength+array[i];
        }
        System.out.println(sumLength);
    }
}

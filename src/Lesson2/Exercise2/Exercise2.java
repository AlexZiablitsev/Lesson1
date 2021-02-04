package Lesson2.Exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        //Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
        //различны?
        int num = 8578;
        int s = (int) Math.log10(num) + 1;
        int array[] = new int[s];
        for (int a = 0; a < array.length; a++) {
            array[a] = num % 10;
            num = num / 10;
        }
        if (array[0] != array[1] && array[0] != array[2] && array[0]!= array[3]){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

            /*for (int a = 0; a < array.length; a++) {
                for (int b = a + 1; b < array.length; b++) {

                    if (array[a] != array[b]) {
                        System.out.println("True.");
                    } else {
                        System.out.println("False.");// хз как сделать чтобы 1 раз выводило "True" или "False"
                    }
                }
            }*/
    }
}

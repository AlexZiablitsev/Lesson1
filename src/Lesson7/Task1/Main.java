package Lesson7.Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
        //Создать массив объектов. Вывести:
        //a) список абитуриентов, имеющих неудовлетворительные оценки;
        //b) список абитуриентов, у которых сумма баллов выше заданной;
        //c) выбрать заданное число n абитуриентов, имеющих самую высокую
        //сумму баллов (вывести также полный список абитуриентов, имеющих
        //полупроходную сумму).

        AbiturientService list = new AbiturientService(0);
        list.addAbiturient(new Abiturient("Towne", "Amber", "Oliver",
                "984 Howell Point Suite 091", 84887875278L, new int[]{7, 5, 9, 10, 6}));//1
        list.addAbiturient(new Abiturient("Ivanov", "Andrey", "Vladimirovich",
                "8919 Boyle Park Wilfridville, FL 51353", 44735128627L, new int[]{4, 4, 5, 6, 8}));//2
        list.addAbiturient(new Abiturient("D'Amore", "Mylene", "Liam",
                "13495 Sunny Spur", 16598655249L, new int[]{10, 9, 8, 8, 9}));//3
        list.addAbiturient(new Abiturient("Carter", "Brennon", "Noah",
                "5302 Dean Ramp Suite 054", 84738860468L, new int[]{9, 10, 5, 8, 7}));//4
        list.addAbiturient(new Abiturient("Shanahan", "Kamron", "William",
                "5233 Everardo Shores Suite 980", 12538941142L, new int[]{10, 9, 8, 8, 9}));//5
        list.addAbiturient(new Abiturient("Robel", "Patrick", "Elijah",
                "24923 Virginia Union", 66178047455L, new int[]{8, 9, 10, 9, 8}));//6
        list.addAbiturient(new Abiturient("Torphy", "Enrico", "James",
                "57772 Ayla Road Apt. 173", 12898967008L, new int[]{3, 9, 5, 3, 7}));//7
        list.addAbiturient(new Abiturient("Carter", "Marina", "Benjamin",
                "5865 Enola Trail", 63769856381L, new int[]{3, 3, 6, 8, 6}));//8
        list.addAbiturient(new Abiturient("Schulist", "Jerrell Jr.", "Lucas",
                "658 Carter Bridge", 66101542533L, new int[]{10, 5, 6, 7, 9}));//9
        list.addAbiturient(new Abiturient("Langosh", "Brent", "Lucas",
                "44157 Eichmann Lights Apt. 551", 14345995818L, new int[]{5, 5, 6, 7, 6}));//10


//        AbiturientService list1 = list.negativeRating();                  //a) список абитуриентов, имеющих неудовлетворительные оценки;
//        list1.printAllList();

//        AbiturientService list2 = list.incomingApplicants(30);            //b) список абитуриентов, у которых сумма баллов выше заданной;
//        list1.printAllList();
        AbiturientService list3 = list.questionable(5);                     //c) выбрать заданное число n абитуриентов, имеющих самую высокую
        list3.printAllList();                                               //сумму баллов (вывести также полный список абитуриентов, имеющих
                                                                            //полупроходную сумму).



    }
}

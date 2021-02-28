package Lesson9.Task1;

import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.


        List<Student> list = new ArrayList<>();
        list.add(new Student("Towne", "Amber", "Oliver",
                "984 Howell Point Suite 091", 84887875278L, new int[]{7, 5, 9, 10, 6}));//1)
        list.add(new Student("Ivanov", "Andrey", "Vladimirovich",
                "8919 Boyle Park Wilfridville, FL 51353", 44735128627L, new int[]{4, 4, 5, 6, 8}));//2
        list.add(new Student("D'Amore", "Mylene", "Liam",
                "13495 Sunny Spur", 16598655249L, new int[]{10, 9, 8, 8, 9}));//3
        list.add(new Student("Carter", "Brennon", "Noah",
                "5302 Dean Ramp Suite 054", 84738860468L, new int[]{9, 10, 5, 8, 7}));//4
        list.add(new Student("Shanahan", "Kamron", "William",
                "5233 Everardo Shores Suite 980", 12538941142L, new int[]{10, 9, 8, 8, 9}));//5
        list.add(new Student("Robel", "Patrick", "Elijah",
                "24923 Virginia Union", 66178047455L, new int[]{8, 9, 10, 9, 8}));//6
        list.add(new Student("Torphy", "Enrico", "James",
                "57772 Ayla Road Apt. 173", 12898967008L, new int[]{3, 9, 5, 3, 7}));//7
        list.add(new Student("Carter", "Marina", "Benjamin",
                "5865 Enola Trail", 63769856381L, new int[]{3, 3, 6, 8, 6}));//8
        list.add(new Student("Schulist", "Jerrell Jr.", "Lucas",
                "658 Carter Bridge", 66101542533L, new int[]{10, 5, 6, 7, 9}));//9
        list.add(new Student("Langosh", "Brent", "Lucas",
                "44157 Eichmann Lights Apt. 551", 14345995818L, new int[]{5, 5, 6, 7, 6}));//10


        System.out.println(StudentService.maxRating(list));

    }
}

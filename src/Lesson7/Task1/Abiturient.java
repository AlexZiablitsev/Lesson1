package Lesson7.Task1;

import java.util.Arrays;

public class Abiturient {

    //Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
    //Создать массив объектов. Вывести:
    //a) список абитуриентов, имеющих неудовлетворительные оценки;
    //b) список абитуриентов, у которых сумма баллов выше заданной;
    //c) выбрать заданное число n абитуриентов, имеющих самую высокую
    //сумму баллов (вывести также полный список абитуриентов, имеющих
    //полупроходную сумму).
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private long phoneNumber;
    private int[] ratings = new int[5];

    public Abiturient() {
    }

    public Abiturient(String lastName, String firstName, String patronymic, String address, long phoneNumber, int[] ratings) {
        this.id = GerereteId.newId();
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.ratings = ratings;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public int[] getRatings() {
        return ratings;
    }

    public int getSumOfrating() {
        int sumOfRating = 0;
        for (int rating : ratings) {
            sumOfRating = sumOfRating + rating;
        }
        return sumOfRating;
    }

    public void info() {
        System.out.println("Abiturient ID " + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", sumOfRating=" + getSumOfrating() +
                ", ratings=" + Arrays.toString(ratings) +
                '}');
    }
}

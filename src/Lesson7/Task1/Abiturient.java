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
    Abiturient[] list = new Abiturient[0];
    private int id;
    private static int ID = 1;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private long phoneNumber;
    private int sumOfRating;
    private int[] ratings = new int[5];
    private final int passingScore = 37;
    private int countmaxsumofRating = 4;


    public Abiturient() {
    }

    ;

    public Abiturient(String lastName, String firstName, String patronymic, String address, long phoneNumber, int[] ratings) {
        this.id = ID;
        ID++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.ratings = ratings;
        this.sumOfRating = getSumOfrating();
    }

    public int getLength() {
        return list.length;
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

    public Abiturient[] addAbiturient(Abiturient a) {
        Abiturient[] newList = new Abiturient[list.length + 1];
        if (list.length >= 0) System.arraycopy(list, 0, newList, 0, list.length);
        newList[list.length] = a;
        list = newList;
        return list;
    }

    public int getSumOfrating() {
        for (int rating : ratings) {
            sumOfRating = sumOfRating + rating;
        }
        return sumOfRating;
    }

    public Abiturient getAbiturient(int index) {
        return list[index];
    }

    public void info() {
        System.out.println("Abiturient ID " + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", sumOfRating=" + sumOfRating +
                ", ratings=" + Arrays.toString(ratings) +
                '}');
    }

    public void printAllList() {
        for (int i = 0; i < getLength(); i++) {
            list[i].info();
        }
    }

    public void negativeRating() {

        for (Abiturient abiturient : list) {
            boolean flag = true;
            for (int j = 0; j < abiturient.getRatings().length; j++)
                if (abiturient.getRatings()[j] < 4) {
                    flag = false;
                    break;
                }

            if (!flag) {
                System.out.println("Abiturient ID " + abiturient.getId() + " " + abiturient.getLastName() + " have negative ratings " + Arrays.toString(abiturient.getRatings()));
            }
        }

    }

    public void incomingApplicants() {
        for (Abiturient abiturient : list) {
            if (abiturient.sumOfRating > passingScore) {
                System.out.println("Abiturient ID " + abiturient.getId() + " " + abiturient.getLastName() + " has been admitted.");
            }
        }
    }

    public void sortList() {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j].sumOfRating < list[j + 1].sumOfRating) {
                    Abiturient tmp = new Abiturient();
                    tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
        for (int i =0; i < countmaxsumofRating; i++){
            list[i].info();
        }
    }

    public void questionable() {
        for (Abiturient abiturient : list) {
            if (abiturient.sumOfRating == passingScore) {
                System.out.println("Abiturient ID " + abiturient.getId() + " " + abiturient.getLastName() + " are questionable");
            }
        }
    }
}

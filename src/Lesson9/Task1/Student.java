package Lesson9.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private long phoneNumber;
    private int[] ratings = new int[5];

    public Student() {
    }

    public Student(String lastName, String firstName, String patronymic, String address, long phoneNumber, int[] ratings) {
        this.id = GererateId.newId();
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public int[] getRatings() {
        return ratings;
    }

    public void info() {
        System.out.println("Student ID " + getId() +
                ", lastName='" + getLastName() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", patronymic='" + getPatronymic() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber=" + getPhoneNumber() +
                ", ratings=" + Arrays.toString(getRatings()) +
                '}');
    }
}

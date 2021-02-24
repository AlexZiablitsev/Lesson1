package Lesson7.Task1;

import java.util.Arrays;

public class AbiturientService {
    private Abiturient[] list;

    public AbiturientService() {
        this.list = new Abiturient[0];
    }

    public AbiturientService(int index) {
        this.list = new Abiturient[index];
    }

    public int getLength() {
        return list.length;
    }

    public Abiturient[] addAbiturient(Abiturient a) {
        Abiturient[] newList = new Abiturient[this.list.length + 1];
        if (list.length >= 0) System.arraycopy(this.list, 0, newList, 0, this.list.length);
        newList[getLength()] = a;
        this.list = newList;
        return this.list;
    }

    public Abiturient getAbiturient(int index) {
        return this.list[index];
    }

    public void printAllList() {
        for (int i = 0; i < getLength(); i++) {
            this.list[i].info();
        }
    }

    public void negativeRating() {
        for (Abiturient abiturient : this.list) {
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

    public void sortList() {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j].getSumOfrating() < list[j + 1].getSumOfrating()) {
                    Abiturient tmp = new Abiturient();
                    tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
    }

    public void incomingApplicants(int count) {
        sortList();
        for (int i = 0; i < getLength(); i++)
            if (list[i].getSumOfrating() > count) {
                System.out.println("Abiturient ID " + list[i].getId() + " " + list[i].getLastName() + " has a MAX rating.");
            }
    }

    public void questionable(int count) {
        sortList();
        int passingScore = list[count].getSumOfrating();
        for (int i = 0; i < count - 1; i++) {
            System.out.println("Abiturient ID " + list[i].getId() + " " + list[i].getLastName() + " has been admitted.");
        }
        for (Abiturient abiturient : list) {
            if (abiturient.getSumOfrating() == passingScore) {
                System.out.println("Abiturient ID " + abiturient.getId() + " " + abiturient.getLastName() + " are questionable");
            }
        }
    }
}


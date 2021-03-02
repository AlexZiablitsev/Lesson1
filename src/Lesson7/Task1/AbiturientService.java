package Lesson7.Task1;

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

    public Abiturient getAbiturient(int index) {
        return this.list[index];
    }

    public Abiturient[] addAbiturient(Abiturient a) {
        Abiturient[] newList = new Abiturient[this.list.length + 1];
        if (list.length >= 0) System.arraycopy(this.list, 0, newList, 0, this.list.length);
        newList[getLength()] = a;
        this.list = newList;
        return this.list;
    }

    public void printAllList() {
        for (int i = 0; i < getLength(); i++) {
            this.list[i].info();
        }
    }

    public AbiturientService negativeRating() {
        AbiturientService newList = new AbiturientService();
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < list[i].getRatings().length; j++)
                if (list[i].getRatings()[j] < 4) {
                    newList.addAbiturient(list[i]);
                    break;
                }
        }
        return newList;
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

    public AbiturientService incomingApplicants(int count) {
        AbiturientService newList = new AbiturientService();
        sortList();
        for (int i = 0; i < getLength(); i++)
            if (list[i].getSumOfrating() > count) {
                newList.addAbiturient(list[i]);
            }return newList;
    }

    public AbiturientService questionable(int count) {
        AbiturientService newList = new AbiturientService();
        sortList();
        int passingScore = list[count].getSumOfrating();
        for (int i = 0; i < count - 1; i++) {
            newList.addAbiturient(list[i]);
        }
        for (Abiturient abiturient : list) {
            if (abiturient.getSumOfrating() == passingScore) {
                newList.addAbiturient(abiturient);
            }
        }return newList;
    }
}


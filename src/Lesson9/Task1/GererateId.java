package Lesson9.Task1;

public class GererateId {
    private static int id = 1;
    public static int newId() {
        return id++;
    }
}


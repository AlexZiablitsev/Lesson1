package Lesson7.Task1;

public class GerereteId {
    private static int id = 1;
    public static int newId() {
        return id++;
    }
}

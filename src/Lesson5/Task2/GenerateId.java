package Lesson5.Task2;

public class GenerateId {

    private static int id = 1;

    public static int newId() {
        return id++;
    }
}

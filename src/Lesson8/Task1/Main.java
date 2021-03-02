package Lesson8.Task1;

public class Main {
    public static void main(String[] args) {

        // Напишите метод для поиска самой длинной строки в массиве.

        String[] array = new String[]{"Духовной жаждою томим",
                "В пустыне мрачной я влачился",
                "И шестикрылый серафим",
                "На перепутье мне явился"};

        System.out.println(maxStr(array));
    }
    public static String maxStr(String[] str){
        String maxLength = "";
        for (String s : str) {
            if (s.length() > maxLength.length()) {
                maxLength = s;
            }
        }
        return maxLength;
    }
}

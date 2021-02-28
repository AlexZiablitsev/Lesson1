package Lesson8.Task3;

public class Main {
    public static void main(String[] args) {
        // Напишите метод, заменяющий в тексте все вхождения слова "бяка" на "вырезано цензурой".

        String str = "Собака бяка, сходила не там где надо.";
        System.out.println(censored(str));

    }

        public static String censored(String str){
        String str1 = str.replaceAll("бяка", "вырезано цензурой");
            return str1;
        }
}

package Lesson8.Task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // Имеются две строки. Напишите метод, возвращающий кол-во вхождений одной строки в другую.
        String str = "Творчество Льва Толстого ознаменовало новый этап в русском и мировом реализме," +
                " выступив мостом между классическим романом XIX века и литературой XX века.";
        String str1 = "века";

        System.out.println(countWord(str, str1));

    }

    public static int countWord(String str, String str1) {
        int count = 0;
        Pattern regex = Pattern.compile(str1);
        Matcher m = regex.matcher((str));
        while (m.find()) {
            count++;
        }
        return count;
    }
}

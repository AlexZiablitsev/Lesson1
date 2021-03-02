package Lesson8.Task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Написать метод, который проверяет является ли строка ip-адресом.

        String str = "abracadabra";
        String str1 = "13.213.188.13";

        defineIp(str);
        defineIp(str1);
    }

    public static void defineIp(String str) {
        Pattern regex = Pattern.compile("\\b(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\b");
        Matcher m = regex.matcher(str);
        if (m.find()) {
            System.out.println("It is ip");
        } else {
            System.out.println("It isn't ip");
        }
    }
}

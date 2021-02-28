package Lesson8.Task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Написать метод, который проверяет является ли строка ip-адресом.

        String str = "abracadabra";
        String str1 = "35.283.181.58";

    defineIp(str);
    defineIp(str1);
    }

    public static void defineIp (String str) {
        Pattern regex = Pattern.compile("(?<ip1>\\d+\\.\\d+\\.\\d+\\.\\d+)(-(?<ip2>\\d+\\.\\d+\\.\\d+\\.\\d+))?$");
        Matcher m  = regex.matcher(str);
        if (m.find()){
            System.out.println("It is ip");
        }else {
            System.out.println("It isn't ip");
        }
    }
}

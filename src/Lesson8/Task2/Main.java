package Lesson8.Task2;


public class Main {
    public static void main(String[] args) {

        // Напишите метод, который проверяет является ли слово палиндром.
        String word1 = "Level";
        String word2 = "Sagas";
        String word3 = "Sub";

        System.out.println(isPalindrome(word1));
        System.out.println(isPalindrome(word2));
        System.out.println(isPalindrome(word3));
    }

    public static boolean isPalindrome(String str) {
        String reversStr = new StringBuffer(str).reverse().toString();
        return str.equalsIgnoreCase(reversStr);
    }
}

package Lesson8.Task2;


public class Main {
    public static void main(String[] args) {

        // Напишите метод, который проверяет является ли слово палиндром.
        String word1 = "Level";
        String word2 = "Sagas";
        String word3 = "Sub";

        isPalindrome(word1);
        isPalindrome(word2);
        isPalindrome(word3);
    }


    public static void isPalindrome(String word) {
        String newWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += word.charAt(i);
        }
        if (word.equalsIgnoreCase(newWord)) {
            System.out.println("Word is palindrome.");
        } else {
            System.out.println("Word isn't palindrome.");
        }
    }
}

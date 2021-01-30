package Lesson1.Ex3;

public class Ex3 {
    public static void main(String[] args) {
        int time = 4500;

        int sec = time % 60;

        int m = (time-sec)/60;

        int min = m%60;

        int h = (m -min)/60;

        int hour =h%24;

        int d = (h-hour)/ 24;

        int day = d%24;

        int w = (d- day)/7;

        int week = w%7;

        System.out.println("A: "+m+ " minute(s) " +sec+" second(s).");
        System.out.println ("B: "+hour+" hour(s) " +min+ " minute(s) "+sec+" second(s).");
        System.out.println("C: "+day+" day(s) "+hour+" hour(s) " +min+ " minute(s) "+sec+" second(s).");
        System.out.println("D: "+week+" week(s) "+day+" day(s) "+hour+" hour(s) " + min + " minute(s) "+ sec+" second(s).");
    }
}

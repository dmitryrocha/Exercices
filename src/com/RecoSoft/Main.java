package com.RecoSoft;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(4456,45));
        System.out.println(getDurationString(3945L));

    }

/*    public static int getDurationString (int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            System.out.println("The parameter is invalid");
            return -1;
        }

        minutes = (seconds/60) + minutes;
        int zzSeconds = (seconds%60) - (seconds/60);
        int yyMinutes = minutes%60;
        int xxHours = (minutes/60);
        System.out.println("The duration is " + xxHours + " hours," + yyMinutes + " minutes and " + zzSeconds + " seconds.");
        return minutes;
    }

    public static int getDurationString (int seconds) {
        if (seconds < 0) {
            System.out.println("The parameter is invalid too");
            return -1;
        }

        int yyMinutes = seconds/60;
        int zzSeconds = seconds%60;
        int xxHours = yyMinutes/60;
        yyMinutes = xxHours%60;
        System.out.println("The duration is " + xxHours + " hours," + yyMinutes + " minutes and " + zzSeconds + " seconds.");
        return seconds;*/

        private static String getDurationString (long minutes, long seconds) {
            if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
                return "Invalid Value";
            }

            long hours = minutes / 60;
            long remainingMinutes = minutes%60;
            return hours + "h " + remainingMinutes + "m " + seconds + "s";


        }

    private static String getDurationString (long seconds) {
            if (seconds<0) {
                return "Invalid Value too";
            }

            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;

            return getDurationString(minutes, remainingSeconds);

    }
}

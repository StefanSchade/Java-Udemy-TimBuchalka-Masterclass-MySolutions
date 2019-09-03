package de.stefanschade.learning.timbuch.masterclass.ch04;

public class Ex09_MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes<0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }

}

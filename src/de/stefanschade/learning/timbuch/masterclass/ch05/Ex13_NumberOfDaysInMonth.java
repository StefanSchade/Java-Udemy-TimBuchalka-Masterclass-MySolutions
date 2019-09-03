package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Ex13_NumberOfDaysInMonth {


    public static boolean isLeapYear(int year) {

        if (year <= 0 || year > 9999) {
            return false;
        } else {

            boolean isDivisibleby4 = (year % 4 == 0);
            boolean isDivisibleby100 = (year % 100 == 0);
            boolean isDivisibleby400 = (year % 400 == 0);

            return ((isDivisibleby4 && !isDivisibleby100 || isDivisibleby400) ? true : false);

        }

    }

    public static int getDaysInMonth(int month, int year) {

        if (year <= 0 || year > 9999) {
            return -1;
        }

        if (month <= 0 || month > 12) {
            return -1;
        }

        int returnValue;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                returnValue = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                returnValue = 30;
                break;
            case 2:
                returnValue = (isLeapYear(year) ? 29 : 28);
                break;
            default:
                returnValue = -1;
        }

        return returnValue;
    }
}

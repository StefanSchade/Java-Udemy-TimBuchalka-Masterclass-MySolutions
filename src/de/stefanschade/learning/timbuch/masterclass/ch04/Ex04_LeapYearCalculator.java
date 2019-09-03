package de.stefanschade.learning.timbuch.masterclass.ch04;

public class Ex04_LeapYearCalculator {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 != 0) {
            // year not divisible by 4 is not a leap year
            return false;
        }

        if (year % 100 != 0) {
            // divisible by 4 but not by 100 is a leap year
            return true;
        }

        if (year % 400 != 0) {
            // divisible by 4 and 100, but not by 400
            return false;
        } else {
            // divisible by 4 and 100, and by 400
            return true;
        }


    }

    public static void main(String[] args) {

        var  input2 = -1600;

        System.out.println(isLeapYear(input2)?  "ja" : "nein" );

        input2 = 1600;

        System.out.println(isLeapYear(input2)?  "ja" : "nein" );

        input2 = 2017;

        System.out.println(isLeapYear(input2)?  "ja" : "nein" );

        input2 = 2000;

        System.out.println(isLeapYear(input2)?  "ja" : "nein" );



    }

}

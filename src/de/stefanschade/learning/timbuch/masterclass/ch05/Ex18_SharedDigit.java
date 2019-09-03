package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Ex18_SharedDigit {


    public static boolean hasSharedDigit(int number1, int number2) {

        int limit_low = 10;
        int limit_high = 1000;


        if (number1 < limit_low || number1 > limit_high || number2 < limit_low || number2 > limit_high) {
            // error
            return false;
        }


        int numberWorkCopy = number1;
        int factor1 = 1;
        int numberDigitCount = 1;

        // Count the digits initialy

        while (numberWorkCopy >= 10) {
            numberWorkCopy = numberWorkCopy / 10;
            factor1 = factor1 * 10;
            numberDigitCount++;
        }
        System.out.println(number1 + " has " + numberDigitCount + " digits");

        // Cycle through all digits

        numberWorkCopy = number1;
        int[] number1Digits = new int[numberDigitCount];
        for (int currentDigit = 1; currentDigit <= numberDigitCount; currentDigit++) {

            int firstdigit = (numberWorkCopy - numberWorkCopy % factor1) / factor1;
            numberWorkCopy = numberWorkCopy - firstdigit * factor1;
            factor1 = factor1 / 10;

            System.out.print("digit #" + currentDigit + " is " + firstdigit);

            // create an array with the digits

            number1Digits[currentDigit - 1] = firstdigit;

            System.out.println(" number1Digits[" + (currentDigit - 1) + "] " + number1Digits[currentDigit - 1]);

        }

        ///////////////////////////////////
        // now start to compare
        ///////////////////////////////////


        numberWorkCopy = number2;
        factor1 = 1;
        numberDigitCount = 1;

        // Count the digits initialy

        while (numberWorkCopy >= 10) {
            numberWorkCopy = numberWorkCopy / 10;
            factor1 = factor1 * 10;
            numberDigitCount++;
        }
        System.out.println(number2 + " has " + numberDigitCount + " digits");

        // Cycle through all digits

        numberWorkCopy = number2;

        for (int currentDigit = 1; currentDigit <= numberDigitCount; currentDigit++) {

            int firstdigit = (numberWorkCopy - numberWorkCopy % factor1) / factor1;
            numberWorkCopy = numberWorkCopy - firstdigit * factor1;
            factor1 = factor1 / 10;

            System.out.println("digit #" + currentDigit + " is " + firstdigit);

            // create an array with the digits

            for (int i = 0; i < number1Digits.length; i++) {


                System.out.print("Comparing " + number1Digits[i] + " to " + firstdigit);

                if (number1Digits[i] == firstdigit) {
                    System.out.println("--> match");
                    return true;

                } else {
                    System.out.println("--> missmatch");
                }

            }

            System.out.println(" number1Digits[" + (currentDigit - 1) + "] " + number1Digits[currentDigit - 1]);

        }


        return false;

    }
}

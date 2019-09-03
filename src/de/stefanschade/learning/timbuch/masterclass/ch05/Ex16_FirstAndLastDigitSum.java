package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Ex16_FirstAndLastDigitSum {


    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            // error
            return -1;
        }

        int numberWorkCopy = number;
        int Result = 0;
        int factor1 = 1;
        int factor2 = 1;
        int numberDigitCount = 1;

        // Count the digits initialy

        while (numberWorkCopy >= 10) {
            numberWorkCopy = numberWorkCopy / 10;
            factor1 = factor1 * 10;
            numberDigitCount++;
        }
        System.out.println(number + " has " + numberDigitCount + " digits");

        // Cycle through all digits

        numberWorkCopy = number;
        for (int currentDigit = 1; currentDigit <= numberDigitCount; currentDigit++) {

            int firstdigit = (numberWorkCopy - numberWorkCopy % factor1) / factor1;
            numberWorkCopy = numberWorkCopy - firstdigit * factor1;
            factor1 = factor1 / 10;

            System.out.print("digit #" + currentDigit + " is " + firstdigit);

            // assemble Result value

            if (numberDigitCount == 1) {

                Result += firstdigit * 2;

                System.out.println(" assenbling Result: " + Result);

            } else if (currentDigit == 1 || currentDigit == numberDigitCount) {

                Result += firstdigit;

                System.out.println(" assenbling Result: " + Result);


            } else {
                System.out.println();
            }

        }

        return Result;

    }
}

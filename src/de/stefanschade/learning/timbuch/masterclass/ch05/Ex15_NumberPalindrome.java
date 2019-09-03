package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Ex15_NumberPalindrome {


    public static boolean isPalindrome(int number) {

        int numberWorkCopy = number;
        int reverse = 0;
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

            // assemble reverse value

            reverse = reverse + firstdigit * factor2;

            factor2 = factor2 * 10;

            System.out.println(" assenbling reverse: " + reverse);

        }

        return reverse == number;


    }

    public static int getDigitCount(int number) {

        if (number < 0) return -1;

        int result = 1;

        while (number >= 10) {
            number = number / 10;
            result++;
        }

        return result;

    }

    // code from the udemy forum
    public static boolean isPalindrome2(int number) {

        int reverseNumber = 0;

        int number2 = number;


        while (number != 0) {

            int lastDigit = number % 10;

            System.out.println("Number is " + number + ". The last digit is " + lastDigit);

            reverseNumber *= 10;

            System.out.println("The reverse number is now " + reverseNumber);

            reverseNumber += lastDigit;

            System.out.println("Reverse number after adding last digit is " + reverseNumber);

            number /= 10;

            System.out.println("The number is now " + number);

            System.out.println("========== End of iteration ==========");

        }

        if (reverseNumber == number2) {

            System.out.println("The number is a palindrome!");

            return true;

        }

        return (reverseNumber == number);

    }
}

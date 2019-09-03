package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Ex23_NumberToWords {
    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int numberreverse = reverse(number);

        int leadingZeros = Ex15_NumberPalindrome.getDigitCount(number) - Ex15_NumberPalindrome.getDigitCount(reverse(number));

        while (numberreverse != 0) {

            int lastDigit = numberreverse % 10;
            numberreverse /= 10;

            //       System.out.println(number + " - " + lastDigit);

            var output = "";

            switch (lastDigit) {
                case 1:
                    output = "One";
                    break;
                case 2:
                    output = "Two";
                    break;
                case 3:
                    output = "Three";
                    break;
                case 4:
                    output = "Four";
                    break;
                case 5:
                    output = "Five";
                    break;
                case 6:
                    output = "Six";
                    break;
                case 7:
                    output = "Seven";
                    break;
                case 8:
                    output = "Eight";
                    break;
                case 9:
                    output = "Nine";
                    break;
                case 0:
                    output = "Zero";
                    break;
            }

            System.out.println(output);

        }

        for (int i = 0; i < leadingZeros; i++) {
            System.out.println("Zero");
        }


    }

    public static int reverse(int number) {

        boolean negativeNumber = false;

        if (number < 0) {
            number = -number;
            negativeNumber = true;
        }

        int result = 0;
        int factor1 = 1;
        int factor2 = 1;
        int numberwork = number;


        for (int i = 1; i < Ex15_NumberPalindrome.getDigitCount(number); i++)
            factor1 = factor1 * 10;

        //    System.out.println(number + " has " + factor1);

        for (int currentDigit = 1; currentDigit <= Ex15_NumberPalindrome.getDigitCount(number); currentDigit++) {

            int firstdigit = (numberwork - numberwork % factor1) / factor1;
            numberwork = numberwork - firstdigit * factor1;
            factor1 = factor1 / 10;

            //      System.out.print("digit #" + currentDigit + " is " + firstdigit);

            // assemble reverse value

            result = result + firstdigit * factor2;

            factor2 = factor2 * 10;

            //    System.out.println(" assenbling reverse: " + result);

        }

        return negativeNumber ? (-1) * result : result;

    }
}

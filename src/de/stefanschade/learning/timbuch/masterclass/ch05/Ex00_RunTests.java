package de.stefanschade.learning.timbuch.masterclass.ch05;


import java.util.Scanner;

public class Ex00_RunTests {

    public static void printMenue() {
        System.out.println("*********************************************");
        System.out.println("*      Tim Buchalka - Java Masterclass      *");
        System.out.println("*         Programing Exercises Ch. 4        *");
        System.out.println("*********************************************");
        System.out.println("* 00 - Print Menue                          *");
        System.out.println("* 15 - Number Palindrome                    *");
        System.out.println("* 16 - First and Last Digit Sum             *");
        System.out.println("* 17 - Even Digit Sum                       *");
        System.out.println("* 18 - Shared Digit                         *");
        System.out.println("* 19 - Last Digit Checker                   *");
        System.out.println("* 20 - Greatest Common Divisor              *");
        System.out.println("* 21 - All Factors                          *");
        System.out.println("* 22 - Perfect Number                       *");
        System.out.println("* 23 - Number to Words                      *");
        System.out.println("* 24 - Flour Pack Problem                   *");
        System.out.println("*                                           *");
        System.out.println("*                                           *");
        System.out.println("*                                           *");
        System.out.println("*                                           *");
        System.out.println("*                                           *");
        System.out.println("*                                           *");
        System.out.println("*                                           *");
        System.out.println("*********************************************");
        System.out.println("* 99 - Exit                                 *");
        System.out.println("*********************************************");
        System.out.println();

    }


    public static void main(String[] args) {

        boolean isEnded = false;

        printMenue();

        Scanner sc = new Scanner(System.in);
        int input = 0;

        while (!isEnded) {

            System.out.print("> ");

            if (sc.hasNextInt()) {
                input = sc.nextInt();

                switch (input) {

                    case 0:
                        printMenue();
                    case 15: // Palindrome

                        System.out.println("Calling testcases for: 01 - Number Palindrome                    *");

                        int number;
                        number = 1234;
                        System.out.println("Is " + number + " a Palindrome? --> " + (Ex15_NumberPalindrome.isPalindrome(number) ? "true" : "false"));
                        number = 1230321;
                        System.out.println("Is " + number + " a Palindrome? --> " + (Ex15_NumberPalindrome.isPalindrome(number) ? "true" : "false"));
                        number = 100;
                        System.out.println("Is " + number + " a Palindrome? --> " + (Ex15_NumberPalindrome.isPalindrome(number) ? "true" : "false"));
                        number = 1001;
                        System.out.println("Is " + number + " a Palindrome? --> " + (Ex15_NumberPalindrome.isPalindrome(number) ? "true" : "false"));
                        break;
                    case 16:
                        System.out.println("Calling testcases for:  02 - First and Last Digit Sum             *");

                        Ex16_FirstAndLastDigitSum.sumFirstAndLastDigit(1123);
                        Ex16_FirstAndLastDigitSum.sumFirstAndLastDigit(3);
                        Ex16_FirstAndLastDigitSum.sumFirstAndLastDigit(10);
                        Ex16_FirstAndLastDigitSum.sumFirstAndLastDigit(1231233);
                        break;
                    case 17:
                        System.out.println("Calling testcases for:  03 - Even Digit Sum                       *");

                        Ex17_EvenDigitSum.getEvenDigitSum(3424);
                        Ex17_EvenDigitSum.getEvenDigitSum(3424);
                        Ex17_EvenDigitSum.getEvenDigitSum(3424);
                        break;
                    case 18:

                        System.out.println("Calling testcases for:  04 - Shared Digit                         *");

                        Ex18_SharedDigit.hasSharedDigit(23, 35);
                        Ex18_SharedDigit.hasSharedDigit(43, 56);
                        break;
                    case 19:
                        System.out.println("Calling testcases for:  05 - Last Digit Checker                   *");

                        Ex19_LastDigitChecker.hasSameLastDigit(56, 3356);
                        Ex19_LastDigitChecker.hasSameLastDigit(74, 58, 34568);
                        break;
                    case 20:
                        System.out.println("Calling testcases for:  06 - Greatest Common Divisor              *");
                        Ex20_GreatestCommonDivisor.getGreatestCommonDivisor(3453534, 464655);
                        break;
                    case 21:
                        System.out.println("Calling testcases for:  07 - All Factors                          *");
                        Ex21_AllFactors.printFactors(3453534);
                        Ex21_AllFactors.printFactors(464655);
                        break;
                    case 22:
                        System.out.println("Calling testcases for:  08 - Perfect Number                       *");
                        for (int i = 1; i < 10000; i++) {
                            if (Ex22_PerfectNumber.isPerfectNumber(i)) {
                                System.out.println(i + " is a perfect number");
                            }
                        }
                        break;
                    case 23:
                        System.out.println("Calling testcases for:  09 - Number to Words                      *");
                        Ex23_NumberToWords.numberToWords(34500300);
                    case 10:
                        System.out.println("* 10 - Flour Pack Problem                   *");
                        System.out.println("* not implemented yet                       *");
                        break;
                    case 99:
                        isEnded = true;
                        break;
                    default:
                        System.out.println("Use a valid entry, press 0 for menue!");
                        System.out.println();
                }
            } else {
                System.out.println("Please Enter a Number");
                System.out.println();
            }
        }
    }


}



package de.stefanschade.learning.timbuch.masterclass.ch04;

public class Ex10_IntEqalityPrinter {

    public static void printEqual(int number1, int number2, int number3) {

        boolean isInvalid = false;
        boolean allNumbersDifferent = true;
        boolean allNumbersEqual = true;

        int[] numbers = {number1, number2, number3};

        for (int i : numbers) {

            if (i<0) {
                isInvalid = true;
                break;
            }

            int equalcounter = 0;

            for (int j : numbers) {

                if (i==j) {
                    equalcounter++;
                } else {
                    allNumbersEqual = false;
                }
            }

            if (equalcounter > 1) {
                allNumbersDifferent = false;
            }


        }


        if (isInvalid) {
            System.out.println("Invalid Value");
        } else if (allNumbersDifferent) {
            System.out.println("All numbers are different");
        } else if (allNumbersEqual) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("Neither all are equal or different");
        }



    }


    public static void main(String[] args) {

        printEqual(1,2,3);
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(1,1,-1);

    }


}

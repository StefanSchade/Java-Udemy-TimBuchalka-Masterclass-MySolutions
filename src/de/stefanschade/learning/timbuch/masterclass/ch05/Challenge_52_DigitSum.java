package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Challenge_52_DigitSum {

    public static int sumDigits(int number) {

        if (number < 10)
            return -1;

        int returnValue = 0;

        while (number > 0) {
            returnValue += number % 10;
            number /= 10;
        }
        return returnValue;
    }


    public static void main(String[] args) {

        int[] input = {1234, 123, 3456, 9999, 9000,9,0,-2};

        for (int i : input) {
            System.out.println(i + " -> " + sumDigits(i));
        }
    }


}

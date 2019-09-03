package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Ex20_GreatestCommonDivisor {


    public static int getGreatestCommonDivisor(int first, int second) {

        int limitLow = 10;

        if (first < limitLow || second < limitLow) {
            return -1;
        }

        System.out.println("First: " + first + " Second: " + second + " Min: " + (first < second ? first : second) + " ");

        for (int i = ((first < second) ? first : second); i > 1; i--) {

            System.out.print("Testing for divisor " + i);

            if (first % i == 0 && second % i == 0) {
                System.out.println("---> passed");
                return i;
            }
            System.out.println("---> no common divisor");
        }

        return -1;

    }
}

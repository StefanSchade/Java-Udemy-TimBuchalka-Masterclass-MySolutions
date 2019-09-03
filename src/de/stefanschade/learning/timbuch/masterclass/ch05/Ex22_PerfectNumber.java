package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Ex22_PerfectNumber {
    public static boolean isPerfectNumber(int number) {

        if (number < 1) return false;

        int sum = 0;

        for (int i = 1; i < number; i++)
            if (number % i == 0) sum += i;

        return sum == number;

    }
}

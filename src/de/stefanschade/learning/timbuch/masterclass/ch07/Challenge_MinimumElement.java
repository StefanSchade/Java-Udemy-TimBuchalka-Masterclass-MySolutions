package de.stefanschade.learning.timbuch.masterclass.ch07;

import java.util.Scanner;

public class Challenge_MinimumElement {

    public static int[] readIntegers(int count) {

        Scanner myScanner = new Scanner(System.in);
        int[] output = new int[5];

        System.out.println("Please enter " + count + " numbers");
        for (int i = 0; i < count; ) {
            System.out.println("Number #" + i);
            if (myScanner.hasNextInt()) {
                output[i] = myScanner.nextInt();
                i++;
            } else {
                System.out.println("Illegal Input, enter INT");
            }
            myScanner.nextLine();
        }
        myScanner.close();
        return output;

    }

    public static int findMinimum(int[] array) {

        int minimumValue = Integer.MAX_VALUE;

        for (int i : array) {
            if (i < minimumValue) minimumValue = i;
        }

        return minimumValue;
    }


    public static void main(String[] args) {
        System.out.println(findMinimum(readIntegers(5)));
    }
}

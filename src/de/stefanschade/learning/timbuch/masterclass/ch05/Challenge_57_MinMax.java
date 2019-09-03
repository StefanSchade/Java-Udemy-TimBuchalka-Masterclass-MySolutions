package de.stefanschade.learning.timbuch.masterclass.ch05;

import java.util.Scanner;

public class Challenge_57_MinMax {

    public static void userInputMinMax() {

        Scanner myScanner = new Scanner(System.in);
        boolean isFinished = false;

        double minValue = Double.MAX_VALUE;
        double maxValue = Double.MIN_VALUE;


        while (!isFinished) {

            System.out.println(" Min: " + minValue);
            System.out.println(" Max: " + maxValue);
            System.out.println("Enter Value:");

            boolean isDouble = myScanner.hasNextDouble();


            if (isDouble) {

                double value = myScanner.nextDouble();

                if (value < minValue)
                    minValue = value;
                if (value > maxValue)
                    maxValue = value;

                System.out.println(value + " read from console.");


            } else {
                System.out.println("Invalid value.");
                isFinished = true;
            }
            myScanner.nextLine();

        }

        System.out.println("Stop processing, final result:");
        System.out.println(" Min: " + minValue);
        System.out.println(" Max: " + maxValue);

        myScanner.close();

    }

    public static void main(String[] args) {

        userInputMinMax();

    }

}

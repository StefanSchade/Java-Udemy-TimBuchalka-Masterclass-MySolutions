package de.stefanschade.learning.timbuch.masterclass.ch05;

import java.util.Scanner;

public class Ex27_InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner myScanner = new Scanner(System.in);

        int valueCount = 0;
        int valueSum = 0;

        boolean finished = false;

        while (!finished) {

            boolean valueIsInt = myScanner.hasNextInt();

            if (valueIsInt) {

                int value = myScanner.nextInt();

                valueCount = valueCount + 1;
                valueSum = valueSum + value;


            } else {

                finished = true;

            }

            myScanner.nextLine();

        }

        long valueAverage;

        if (valueCount == 0) {
            valueAverage = 0;
        } else {

            double average = (double) valueSum / valueCount;

          //  System.out.println(valueSum);
          //  System.out.println(valueCount);
          //  System.out.println(average);

            valueAverage = Math.round(average);
        }

        System.out.println("SUM = " + valueSum + " AVG = " + valueAverage);


    }


    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

}

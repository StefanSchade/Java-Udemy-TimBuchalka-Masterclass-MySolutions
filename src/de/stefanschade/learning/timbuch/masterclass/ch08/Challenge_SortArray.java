package de.stefanschade.learning.timbuch.masterclass.ch08;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge_SortArray {

    public static int[] getIntegers(int length) {
        Scanner myScanner = new Scanner(System.in);
        int[] returnvalue = new int[length];

        for (int i = 0; i < length; ) {

            System.out.println("Enter integer: ");

            if (myScanner.hasNextInt()) {
                returnvalue[i] = myScanner.nextInt();
                i++;
            } else {
                System.out.println("Illegal Input, try again");
            }
            myScanner.nextLine();
        }
        return returnvalue;
    }

    public static int[] getRandomIntegers(int length) {

        int[] returnvalue = new int[length];

        for (int i = 0; i < length; i++) {
            returnvalue[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
        return returnvalue;
    }


    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("#" + i + ": " + array[i]);
        }

    }

    // output has 1 additional field containing stepcount
    public static long[] sortIntegers1(int[] input) {

        long[] output = new long[input.length + 1];
        int[] input_cpy = new int[input.length];
        long stepcount = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            input_cpy[i] = input[i];
            stepcount++;
        }


        for (int i = 0; i < input_cpy.length; i++) {

            // maximum of the input array
            for (int j = 0; j < input_cpy.length; j++) {
                if (maxValue < input_cpy[j]) {
                    maxValue = input_cpy[j];
                    stepcount++;
                }
            }

            // erase the first occurence of the maximum
            // and add it to the output array
            for (int j = 0; j < input_cpy.length; j++) {
                if (maxValue == input_cpy[j]) {
                    output[i] = maxValue;
                    input_cpy[j] = Integer.MIN_VALUE;
                    stepcount++;
                    break;
                }
            }

            maxValue = Integer.MIN_VALUE;
        }

        output[output.length - 1] = stepcount;
        return output;
    }

    // output has 1 additional field containing stepcount
    public static int[] sortIntegers(int[] input) {

        int[] output = new int[input.length + 1];
        int[] input_cpy = Arrays.copyOf(input, input.length);
        int maxValue;

        for (int i = 0; i < input_cpy.length; i++) {

            maxValue = getMaxValue(input_cpy);

            // erase the first occurence of the maximum
            // and add it to the output array
            for (int j = 0; j < input_cpy.length; j++) {
                if (maxValue == input_cpy[j]) {
                    output[i] = maxValue;
                    input_cpy[j] = Integer.MIN_VALUE;
                    break;
                }
            }
            maxValue = Integer.MIN_VALUE;
        }
        return output;
    }

    private static int getMaxValue(int[] inputArray) {
        int maxValue = Integer.MIN_VALUE;
        // maximum of the input array
        for (int j = 0; j < inputArray.length; j++) {
            if (maxValue < inputArray[j]) {
                maxValue = inputArray[j];
            }
        }
        return maxValue;
    }


    // alternative implementation
    public static long[] sortIntegers2(int[] input) {

        boolean everythingSorted = false;
        long[] output = new long[input.length + 1];
        long stepcount = 0;

        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
            stepcount++;
        }

        while (!everythingSorted) {
            everythingSorted = true;
            for (int i = 0; i < output.length - 2; i++) {
                if (output[i] < output[i + 1]) {
                    int tmp = input[i];
                    output[i] = output[i + 1];
                    output[i + 1] = tmp;
                    everythingSorted = false;

                }
                stepcount++;
            }
        }

        output[output.length - 1] = stepcount;

        return output;

    }


    public static double average(long[] input) {

        int sum = 0;
        for (long i : input) {
            sum += i;
        }

        return (double) sum / (double) (input.length);
    }


    public static void main(String[] args) {

//        printArray(sortIntegers2(getIntegers(5)));
//        System.out.println(average(getIntegers(5)));


        int durchläufe = 100;


        int maxArrayLänge = 10000;

        for (int arrayLänge = 1; arrayLänge <= maxArrayLänge; arrayLänge *= 10) {

            long[] result1 = new long[durchläufe];
            long[] result2 = new long[durchläufe];


            for (int i = 0; i < durchläufe; i++) {

                result1[i] = sortIntegers1(getRandomIntegers(arrayLänge))[arrayLänge];
                result2[i] = sortIntegers2(getRandomIntegers(arrayLänge))[arrayLänge];

            }

            double avg1 = average(result1);
            double avg2 = average(result2);


            System.out.println("Array Length: " + arrayLänge);
            System.out.println("--------------------------");
            System.out.println("Implementation #1 took " + avg1 + " steps in average");
            System.out.println("Implementation #2 took " + avg2 + " steps in average");
            System.out.println("Efficiency factor " + avg2 / avg1);
            System.out.println();
            System.out.println();
        }

    }
}
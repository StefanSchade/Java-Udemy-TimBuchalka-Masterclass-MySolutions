package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Ex14_SumOddRange {


    public static int sumOdd(int start, int end) {
        if (start <= end && start > 0 && end > 0) {

            int returnValue = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    returnValue = returnValue+i;
                }
            }
            return returnValue;
        } else {
            return -1;
        }
    }


    public static boolean isOdd(int number) {

        boolean returnValue;
        if ((number < 0) || ((number % 2) == 0)) {
            returnValue = false;
        } else {
            returnValue = true;
        }
        return returnValue;

    }
}
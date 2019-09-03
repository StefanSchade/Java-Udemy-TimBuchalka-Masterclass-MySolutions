package de.stefanschade.learning.timbuch.masterclass.ch04;

public class Ex01_SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }

        long milesPerHourRounded = (long) (kilometersPerHour / 1.609 + 0.5);

//        System.out.println(kilometersPerHour / 1.609);

        return milesPerHourRounded;

    }

    public static void printConversion(double kilomentersPerHour) {

        if (kilomentersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            double kilomentersPerHourRounded = Math.round(100 * kilomentersPerHour);
            System.out.println(kilomentersPerHourRounded / 100 + " km/h = " + toMilesPerHour(kilomentersPerHour) + " mi/h");

        }

    }


    public static void main(String[] args) {

        double input;

        input = -2.0;
        System.out.println(input + " km in full miles is " + toMilesPerHour(input));
        printConversion(input);

        input = 10.25;
        System.out.println(input + " km in full miles is " + toMilesPerHour(input));
        printConversion(input);

        input = -5.6;
        System.out.println(input + " km in full miles is " + toMilesPerHour(input));
        printConversion(input);

        input = 25.42;
        System.out.println(input + " km in full miles is " + toMilesPerHour(input));
        printConversion(input);

        input = 75.114;
        System.out.println(input + " km in full miles is " + toMilesPerHour(input));
        printConversion(input);

    }
}

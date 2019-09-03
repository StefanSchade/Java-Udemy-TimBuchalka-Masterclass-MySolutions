package de.stefanschade;

import java.util.Random;

public class ternaryOperatorExamples {


    public static void main(String[] args) {

        Random ran = new Random();

        int counter = 0;
        boolean lastWasEven = false;
        int maxCounter = 0;

        for (int i = 1; i <= 50; i++) {

            int zufallsZahl = ran.nextInt(100);

            // od or even value
            boolean thisIsEven = (zufallsZahl % 2 == 0) ? true : false;
            // value changed since last loop?
            counter = thisIsEven ^ lastWasEven ? 1 : counter + 1;
            // adjust maxcounter
            maxCounter = maxCounter<counter ? counter : maxCounter;
            lastWasEven = thisIsEven;


            String suffix;
            switch (counter) {
                case 1:
                    suffix = "st";
                    break;
                case 2:
                    suffix = "nd";
                    break;
                case 3:
                    suffix = "rd";
                    break;
                default:
                    suffix = "th";
            }

            // assemble string note enfolding brackeets
            System.out.println(zufallsZahl + " is the " + counter + suffix + " "
                    + (thisIsEven ? "even" : "odd") + " number in a row");

        }

        System.out.println();
        System.out.println("We encountered " + maxCounter + " consecutive values");

    }

}

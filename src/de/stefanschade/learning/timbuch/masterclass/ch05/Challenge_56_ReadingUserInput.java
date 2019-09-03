package de.stefanschade.learning.timbuch.masterclass.ch05;

import java.util.Scanner;

public class Challenge_56_ReadingUserInput {

    public static void readUserInput() {

        Scanner myScanner = new Scanner(System.in);
        int numberCounter = 0;
        int numberSum = 0;

        while (numberCounter < 10) {
            boolean intEntered = myScanner.hasNextInt();
            if (intEntered) {
                int i = myScanner.nextInt();
                numberCounter++;
                numberSum += i;
                System.out.println("Number #"+ numberCounter + ": " + i + " entered! - Sum now " + numberSum);
            } else {
                System.out.println("Invalid Character, please enter INT");
            }
            myScanner.nextLine();
        }

        myScanner.close();
    }


    public static void main(String[] args) {
        readUserInput();
    }
}

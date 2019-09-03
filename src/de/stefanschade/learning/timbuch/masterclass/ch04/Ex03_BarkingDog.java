package de.stefanschade.learning.timbuch.masterclass.ch04;

public class Ex03_BarkingDog {

    public static boolean shouldWakeUp(boolean dogIsBarking, int hourOfDay) {

        if(dogIsBarking && (((hourOfDay >= 0) && (hourOfDay < 8)) || ((hourOfDay > 22) && (hourOfDay < 24)))) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        var  input1 = true;
        var  input2 = 2;

        System.out.println(shouldWakeUp(input1, input2)?  "ja" : "nein" );

        input1 = true;
        input2 = -1;

        System.out.println(shouldWakeUp(input1, input2)?  "ja" : "nein" );

        input1 = true;
        input2 = 24;

        System.out.println(shouldWakeUp(input1, input2)?  "ja" : "nein" );


    }

}

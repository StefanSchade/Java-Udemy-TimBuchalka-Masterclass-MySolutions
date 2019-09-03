package de.stefanschade.learning.timbuch.masterclass.ch04;

public class Ex05_DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        int rounded1 = (int) (number1 * 1000);
        int rounded2 = (int) (number2 * 1000);

    //    System.out.println(rounded1 + " == " + rounded2);

        return rounded1== rounded2;

    }

    public static void main(String[] args) {


        var  input1 = -3.1756;
        var  input2 = -3.1756;

        System.out.println(areEqualByThreeDecimalPlaces(input1, input2)?  "ja" : "nein" );

        input1 = 3.175;
        input2 = 3.176;

        System.out.println(areEqualByThreeDecimalPlaces(input1, input2)?  "ja" : "nein" );

        input1 = 3.0;
        input2 = 3.0;

        System.out.println(areEqualByThreeDecimalPlaces(input1, input2)?  "ja" : "nein" );

        input1 = -3.123;
        input2 = 3.123;

        System.out.println(areEqualByThreeDecimalPlaces(input1, input2)?  "ja" : "nein" );



    }


}

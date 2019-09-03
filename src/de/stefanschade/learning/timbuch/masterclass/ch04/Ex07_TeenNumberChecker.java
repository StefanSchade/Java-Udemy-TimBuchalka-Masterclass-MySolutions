package de.stefanschade.learning.timbuch.masterclass.ch04;

public class Ex07_TeenNumberChecker {

    public static boolean hasTeen(int number1, int number2, int number3) {

        int[] numbers = {
                number1, number2, number3
        };

        for (int i : numbers) {

            if (isTeen(i)) {
                return true;
            }

        }

        return false;

    }


    public static boolean isTeen(int i) {

        if (i >= 13 && i <= 19) {
            return true;
        } else {
            return false;
        }


    }


    public static void main(String[] args) {

        var  input1 = 9;
        var  input2 = 99;
        var input3 = 19;

        System.out.println(hasTeen(input1, input2, input3)?  "ja" : "nein" );

        input1 = 23;
        input2 = 15;
        input3 = 42;

        System.out.println(hasTeen(input1, input2, input3)?  "ja" : "nein" );

        input1 = 22;
        input2 = 23;
        input3 = 34;

        System.out.println(hasTeen(input1, input2, input3)?  "ja" : "nein" );


    }



}

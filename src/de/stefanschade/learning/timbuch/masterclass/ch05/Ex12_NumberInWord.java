package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Ex12_NumberInWord {

    public static void printNumberInWord(int number) {

        String returnValue;

        switch (number) {
            case 0:
                returnValue = "ZERO";
                break;
            case 1:
                returnValue = "ONE";
                break;
            case 2:
                returnValue = "TWO";
                break;
            case 3:
                returnValue = "THREE";
                break;
            case 4:
                returnValue = "FOUR";
                break;
            case 5:
                returnValue = "FIVE";
                break;
            case 6:
                returnValue = "SIX";
                break;
            case 7:
                returnValue = "SEVEN";
                break;
            case 8:
                returnValue = "EIGHT";
                break;
            case 9:
                returnValue = "NINE";
                break;
            default:
                returnValue = "OTHER";
        }

        System.out.println(returnValue);

    }

}

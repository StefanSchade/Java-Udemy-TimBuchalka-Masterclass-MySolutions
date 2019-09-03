package de.stefanschade.learning.tryout;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FlowControlStatements {

    public static void main(String[] args) {

/*
        Remainder(-11, 2);
        ifThen(2);
        ternaryOperator(new Random().nextFloat()<0.5);
        switchStatement(3);
        switchStatement('A');
        ForLoop01(1,10);
*/
        whileLoopExamples(5);
        doWhileLoopExample(6);

        whileLoopWithBrreak(5);
        WhileWithContinueStatement(4, 20);


        String input = "a b c d e f g h";

        ForLoop02(input);

    }

    private static void WhileWithContinueStatement(int number, int finishnumber) {

        while (number <= finishnumber) {
            number++;
            if(number %2!=0) {
                continue;
            }
            System.out.println("Even Number "+ number);
        }
    }

    private static void doWhileLoopExample(int limitValue) {
        int count = 1;
        do {
            System.out.println("do-while count value was " + count);
            count++;
        } while(count !=limitValue);
    }

    private static void whileLoopExamples(int limitValue) {
        int count = 0;
        while (count != limitValue) {
            System.out.println("while version 1 count value is " + count);
            count++;
        }

    }


    private static void whileLoopWithBrreak (int limitValue) {
        int count = 0;
        while (true) {
            if (count==5){
                break;
            }
            System.out.println("while version 2 count value is " + count);
            count++;
        }
    }

    private static void Remainder(int i, int j) {

        System.out.println("i is " + i);
        System.out.println("j is " + j);

        int k = i % j;
        System.out.println("i%j is " + k);
    }

    private static void ternaryOperator(boolean decisionValue) {
        String mood = decisionValue ? mood="happy" : "sad";
        System.out.println(mood);
    }

    private static void ForLoop01(int initialValue, int limitValue) {
        for (int i = initialValue; i <= limitValue; i++) {
            System.out.println("Iterator Value: "+ i);
        }
    }

    private static void ForLoop02(String stringData) {


        // can be used for all arrazs or collectiosn if you want to cyle first to last

        String[] dataArray = stringData.split(" ");

        // shorthand for traversing all elements of an array

        for (String s: dataArray) {
            System.out.println(s);
        }


        // this notation can allso be used for collections SINCE JAVA 5

        Integer[] spam = new Integer[] { 1, 2, 3 };
        List<Integer> list = Arrays.asList(spam);

        for (int i: list) {
            System.out.println(i);
        }


//        int[] intarray = {1, 2324, 234, 2423, 234, 234};
//
//        for (int i: intarray) {
//            System.out.println(i);
//        }




    }

    private static void switchStatement(int switchValue) {

        switch (switchValue) {
            case 1:
                System.out.println("Switch Value was one");
                break;
            case 2:
                System.out.println("Switch Value was two");
                break;
            case 3: case 4: case 5:
                System.out.println("Switch Value was three, four or five");
            default:
                System.out.println("SwitchValue was neither one nor two");
        }


    }
        private static void switchStatement(char switchValue) {

            switch (switchValue) {
                case 'A':
                    System.out.println("Switch Value was A");
                    break;
                case 'B':
                    System.out.println("Switch Value was B");
                    break;
                case 'C':
                case 'D':
                case 'E':
                    System.out.println("Switch Value was C, D or E");
                default:
                    System.out.println("SwitchValue was neither A nor B");
            }

        }

    private static void ifThen(int ifValue) {

        if (ifValue == 1) {
            System.out.println("ifValue was one");
        } else {
            System.out.println("ifValue was not one");
            ;
        }

    }


}

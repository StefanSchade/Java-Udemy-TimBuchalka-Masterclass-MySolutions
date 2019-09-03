package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Ex26_DiagonalStar {

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int x = 1; x <= number; x++) {

                for (int y = 1; y <= number; y++) {

                    boolean mainDiagonal = x == y;
                    boolean counterDiagonal = x == (number - y + 1);
                    boolean firstOrLastRow = (x == 1) || (x == number);
                    boolean firstOrLastCol = (y == 1) || (y == number);

                    if (mainDiagonal || counterDiagonal || firstOrLastCol || firstOrLastRow) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                    if (y == number) {
                        System.out.println();
                    }


                }


            }

        }

    }


    public static void main(String[] args) {
        printSquareStar(20);
        printSquareStar(5);
        printSquareStar(15);

    }

}

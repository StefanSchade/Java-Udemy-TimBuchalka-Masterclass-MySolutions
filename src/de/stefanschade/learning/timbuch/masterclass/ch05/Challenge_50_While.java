package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Challenge_50_While {

    public static boolean isEven(int i) {
        return i%2==0;
    }


    public static void main(String[] args) {

        int input[] = {-3,-2,-1,0,1,2};

        for (int i : input) {
            System.out.println(i + " is an " + (isEven(i) ? "even" : "odd") + " number");

        }




    }
}

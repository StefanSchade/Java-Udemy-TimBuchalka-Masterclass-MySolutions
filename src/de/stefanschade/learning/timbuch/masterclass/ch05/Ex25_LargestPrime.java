package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Ex25_LargestPrime {

    public static int getLargestPrime(int number) {

        if (number<=1) {
            return -1;
        }

        for (int i = number; i>1; i--) {
            if(number%i==0) {
                // i is factor, is it prime?
                boolean isPrime = true;
                for (int j = i-1; j>1; j--) {
                    if(i%j==0) {
                        isPrime=false;
                    }
                }
                if(isPrime) {
                    return i;
                }
            }
        }

        return 1;

    }


    public static void main(String[] args) {

        System.out.println("result: " + getLargestPrime(21));
        System.out.println("result: " + getLargestPrime(217));
        System.out.println("result: " + getLargestPrime(0));
        System.out.println("result: " + getLargestPrime(45));
        System.out.println("result: " + getLargestPrime(0));


    }
}

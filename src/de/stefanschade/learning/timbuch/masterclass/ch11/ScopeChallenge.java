package de.stefanschade.learning.timbuch.masterclass.ch11;

import java.util.Scanner;

public class ScopeChallenge {


    public static void main(String[] args) {

        X x = new X(x().nextInt());

        x.x();

    }


    static Scanner x() {
        return new Scanner(System.in);
    }

}

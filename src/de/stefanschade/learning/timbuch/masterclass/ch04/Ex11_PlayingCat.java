package de.stefanschade.learning.timbuch.masterclass.ch04;

public class Ex11_PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        int rangeFrom;
        int rangeTo;

        rangeFrom = 25;

        if (summer) {
            rangeTo = 45;
        } else {
            rangeTo = 35;
        }

        if (temperature <= rangeTo && temperature >= rangeFrom) {
            return true;
        } else {
            return false;
        }
    }

}

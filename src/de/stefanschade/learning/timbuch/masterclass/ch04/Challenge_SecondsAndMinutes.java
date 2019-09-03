package de.stefanschade.learning.timbuch.masterclass.ch04;

// I did not create the required package structure as it contradicts the structure
// I have chosen for the materials connected to the hole course

// it is acutally more compicated then necessary since it accepts more than 60 seconds.


public class Challenge_SecondsAndMinutes {

    public static String getDurationString(int minutes, int seconds) {

        if (minutes<0 || seconds < 0) {
            return "Invalid Value";
        }

//        if (seconds<0 || seconds>59) {
//            return "Invalid Value";
//        }

        long totalSeconds = minutes*60 + seconds;
        long hours = totalSeconds/3600;
        long remainingMinutes = (totalSeconds % 3600) / 60;
        long remainingSeconds = (totalSeconds % 3600) % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";

    }


    public static String getDurationString(int seconds) {

        if(seconds<0) {
            return "Invalid Value";
        } else {
            int minutes = seconds/60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes,remainingSeconds);
        }
    }


    public static void main(String[] args) {

        System.out.println(getDurationString(3601,5));

        // would not work in tims code
        System.out.println(getDurationString(3600,3661));

        System.out.println(getDurationString(3661));
    }

}

package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Challenge_46_DayOfWeek {

    public static void printDayOfWeekUsingSwitch(int tagesnummer) {

        String tagesname;

        switch (tagesnummer) {
            case 1:
                tagesname = "Montag";
                break;
            case 2:
                tagesname = "Dienstag";
                break;
            case 3:
                tagesname = "Mittwoch";
                break;
            case 4:
                tagesname = "Donnerstag";
                break;
            case 5:
                tagesname = "Freitag";
                break;
            case 6:
                tagesname = "Samstag";
                break;
            case 7:
                tagesname = "Sonntag";
                break;
            default:
                tagesname = "Invalid Input";
                break;
        }

        System.out.println(tagesname);
    }

    
    public static void printDayOfWeekUsingIf(int tagesnummer) {
        
        String tagesname;
        
        if (tagesnummer == 1) {
            tagesname = "Montag";
        } else if (tagesnummer == 2){
            tagesname = "Dienstag";
        } else if (tagesnummer == 3){
            tagesname = "Mittwoch";
        } else if (tagesnummer == 4){
            tagesname = "Donnerstag";
        } else if (tagesnummer == 5){
            tagesname = "Freitag";
        } else if (tagesnummer == 6){
            tagesname = "Samstag";
        } else if (tagesnummer == 7){
            tagesname = "Sonntag";
        } else {
            tagesname = "Invalid Input";
        }

        System.out.println(tagesname);
        
        
    }
    
    
    
    
    

    public static void main(String[] args) {

        printDayOfWeekUsingSwitch(1);
        printDayOfWeekUsingSwitch(2);
        printDayOfWeekUsingSwitch(3);
        printDayOfWeekUsingSwitch(-1);
        printDayOfWeekUsingSwitch(22);
        printDayOfWeekUsingSwitch(7);

        System.out.println("\n\n");

        printDayOfWeekUsingIf(1);
        printDayOfWeekUsingIf(2);
        printDayOfWeekUsingIf(3);
        printDayOfWeekUsingIf(-1);
        printDayOfWeekUsingIf(22);
        printDayOfWeekUsingIf(7);


    }

}

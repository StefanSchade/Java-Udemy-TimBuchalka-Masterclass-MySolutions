package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Challenge_70_Car extends Challenge_70_Vehicle {

    private double[] gearTransmissonRatio;
    private int currentGear;
    private int minRev;
    private int maxRev;
    private int currentRev;

    public Challenge_70_Car(double axleRatio, double wheelRadius, double[] gearTransmissonRatio, int minRev, int maxRev) {
        super(axleRatio, wheelRadius);
        this.gearTransmissonRatio = gearTransmissonRatio;
        this.minRev = minRev;
        this.maxRev = maxRev;
        this.currentRev = 0;
        this.currentGear = 1;
    }

    public void startEngine() {
        if (currentRev >= minRev) {
            System.out.println("Squeak! Engine was already running!");
        } else  {
            this.currentRev = minRev;
        }
    }

    public void stopEngine() {
        this.currentRev = 0;
    }

    public void accelerate(int revs) {

        if (revs <= 0) {
            System.out.println("Specify positive value!");
        } else if (currentRev == 0) {
            System.out.println("Start Engine first!");
        } else {
            if (currentRev + revs > maxRev) {
                currentRev = maxRev;
                System.out.println("Engine reached maximum revs!");
            } else {
                currentRev += revs;
            }
        }
    }

    public void outputCurrentDriveState() {

        if (currentRev == 0) {
            System.out.println("Engine is off!");
        } else {
            System.out.println("Current speed: " + getSpeed(getSpeedDriveTrain()) + " / Current revs: "
                    + currentRev + " / Min revs: " + minRev + " / Max revs: " + maxRev);
        }

    }

    private double getSpeedDriveTrain() {

        return this.gearTransmissonRatio[this.currentGear-1] * currentRev;

    }

    public void decelearate(int revs) {

        if (revs <= 0) {
            System.out.println("Specify positive value!");
        } else {
            if (currentRev - revs < minRev) {
                currentRev = 0;
                System.out.println("Engine stalled!");
            } else {
                currentRev -= revs;
            }
        }
    }

    public void setCurrentGear(int gear) {


        if(gear < 0 || gear > gearTransmissonRatio.length) {
            System.out.printf("Gear: " + gear + " not allowed");
        } else {
            this.currentGear=gear;
        }

        System.out.println("Gear set to " + gear);
    }


}

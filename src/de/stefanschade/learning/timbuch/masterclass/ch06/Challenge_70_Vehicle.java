package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Challenge_70_Vehicle {

    private double axleRatio;
    private double currentSpeed;
    private double wheelRadius;

    public Challenge_70_Vehicle(double axleRatio, double wheelRadius) {
        this.axleRatio = axleRatio;
        this.wheelRadius = wheelRadius;
    }


    public double getAxleRatio() {
        return axleRatio;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getWheelRadius() {
        return wheelRadius;
    }

    public double getSpeed(double driveTrainSpeed) {
        double wheelCircumference = 2* wheelRadius * Math.PI;
        return 60*axleRatio * wheelCircumference * driveTrainSpeed / 1000.0;
    }



}

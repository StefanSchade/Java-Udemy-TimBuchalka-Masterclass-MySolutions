package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Ex36_Cuboid extends Ex36_Rectangle {

    private double height;

    public Ex36_Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = Math.max(height, 0.0);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}


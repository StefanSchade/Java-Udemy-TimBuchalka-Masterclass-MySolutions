package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Ex35_Cylinder extends Ex35_Circle {

    private double height;

    public Ex35_Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * getArea();
    }

}

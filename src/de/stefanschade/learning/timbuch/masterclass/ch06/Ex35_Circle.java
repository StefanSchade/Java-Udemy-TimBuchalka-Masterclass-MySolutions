package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Ex35_Circle {
    private double radius;

    public Ex35_Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

}

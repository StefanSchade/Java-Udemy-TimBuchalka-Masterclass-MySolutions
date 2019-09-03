package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Ex36_Rectangle {

    private double width;
    private double length;

    public Ex36_Rectangle(double width, double length) {

        width = Math.max(width, 0.0);
        length = Math.max(length, 0.0);

        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }

}

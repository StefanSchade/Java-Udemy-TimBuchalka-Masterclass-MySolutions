package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Ex33_Floor {

    private double width;
    private double length;

    public Ex33_Floor(double width, double length) {

        width = Math.max(width,0.0);
        length = Math.max(length,0.0);

        this.width = width;
        this.length = length;
    }


    public double getArea() {
        return this.width*this.length;
    }

}

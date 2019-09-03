package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Ex31_Wall {

    private double width;
    private double height;


    public Ex31_Wall(double width, double height) {

        // negative values are processed as 0
        width = Math.max(width, 0.0);
        height = Math.max(height, 0.0);

        this.width = width;
        this.height = height;
    }

    public Ex31_Wall() {
        this(0.0, 0.0);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        width = Math.max(width, 0.0);
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        height = Math.max(height, 0.0);
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

}

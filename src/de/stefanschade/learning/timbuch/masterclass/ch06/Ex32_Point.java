package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Ex32_Point {

    private int x;
    private int y;

    public Ex32_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ex32_Point() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Ex32_Point that) {
        double xDist = this.getX() - that.getX();
        double yDist = this.getY() - that.getY();
        double distance = Math.sqrt(xDist * xDist + yDist * yDist);
        return distance;
    }

    public double distance(int x, int y) {
        return this.distance(new Ex32_Point(x,y));
    }
    public double distance() {
        return this.distance(0,0);
    }

}

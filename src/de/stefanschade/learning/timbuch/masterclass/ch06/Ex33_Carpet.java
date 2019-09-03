package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Ex33_Carpet {

    private double cost;


    public Ex33_Carpet(double cost) {

        cost = Math.max(cost, 0.0);

        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}

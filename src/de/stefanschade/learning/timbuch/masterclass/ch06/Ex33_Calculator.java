package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Ex33_Calculator {

    private Ex33_Floor floor;
    private Ex33_Carpet carpet;

    public Ex33_Calculator(Ex33_Floor floor, Ex33_Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {

        return carpet.getCost()*floor.getArea();

    }


}

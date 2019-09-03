package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Challenge_70_Porsche extends Challenge_70_Car{

    public Challenge_70_Porsche() {
        super(0.555, 0.26, new double[]{3.91, 2.29, 1.55, 1.3, 1.08, 0.88, 0.71}, 1200, 7800);
    }

    public static void main(String[] args) {
        Challenge_70_Porsche myPorsche = new Challenge_70_Porsche();

        myPorsche.startEngine();

        myPorsche.outputCurrentDriveState();

        myPorsche.setCurrentGear(7);

        myPorsche.accelerate(6600);

        myPorsche.outputCurrentDriveState();

        myPorsche.decelearate(7000);


    }

}

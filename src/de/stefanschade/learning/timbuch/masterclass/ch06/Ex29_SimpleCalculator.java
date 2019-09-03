package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Ex29_SimpleCalculator {

    private double firstNumber = 0.0;
    private double secondNumber = 0.0;


    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }


    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber*secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber==0) return 0;

        return firstNumber/secondNumber;
    }


}

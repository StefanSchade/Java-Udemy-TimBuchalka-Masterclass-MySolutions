package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Ex34_ComplexNumber {

    private double real;
    private double imaginary;

    public Ex34_ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(Ex34_ComplexNumber number) {
        this.add(number.real, number.imaginary);
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }


    public void subtract(Ex34_ComplexNumber number) {
        this.subtract(number.real, number.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }


}

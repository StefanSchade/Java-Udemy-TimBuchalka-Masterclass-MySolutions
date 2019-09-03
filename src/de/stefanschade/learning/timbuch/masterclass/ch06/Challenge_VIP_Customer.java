package de.stefanschade.learning.timbuch.masterclass.ch06;

public class Challenge_VIP_Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Challenge_VIP_Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Challenge_VIP_Customer(String name, double creditLimit) {
        this(name, creditLimit, "No Email Specified");

    }

    public Challenge_VIP_Customer() {
        this("Default", 0.0);
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {

        Challenge_VIP_Customer vip_customer = new Challenge_VIP_Customer("Tim", 1000.00, "Tim@tim.com");

        System.out.println(vip_customer.getName());
        System.out.println(vip_customer.getCreditLimit());
        System.out.println(vip_customer.getEmail());

    }

}

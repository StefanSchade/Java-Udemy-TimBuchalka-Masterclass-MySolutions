package de.stefanschade.learning.timbuch.masterclass.ch07;

public class Challenge_HealthyBurger extends Challenge_Hamburger {

    public static final int MAX_NUMBER_ADDITIONS = 4;


    public int maxItems(){
        return 4;
    }

    // suddenly it works
    public void addExtra(Challenge_Addition extra) {
        this.addExtra(extra,MAX_NUMBER_ADDITIONS);
    }


    public Challenge_HealthyBurger(String rollType, String meat, double price) {
        super(rollType, meat, price);
    }
}

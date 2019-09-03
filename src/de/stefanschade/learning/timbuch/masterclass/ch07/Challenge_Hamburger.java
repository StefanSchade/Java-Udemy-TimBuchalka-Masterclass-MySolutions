package de.stefanschade.learning.timbuch.masterclass.ch07;

import java.util.LinkedList;
import java.util.List;

public class Challenge_Hamburger {

    private String rollType;
    private String meat;
    private double price;

    public static final int MAX_NUMBER_ADDITIONS = 2;

    public int maxItems(){
        return 2;
    }

    private List<Challenge_Addition> additionList = new LinkedList<Challenge_Addition>();

    public Challenge_Hamburger(String rollType, String meat, double price) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;

        System.out.println("Burger with " + rollType
                + " roll and " + meat + " selected for " + price);
    }


    public void addExtra(Challenge_Addition extra, int max) {

        if (additionList.size() < max) {
            additionList.add(extra);
            price += extra.getPrice();

            System.out.println("Extra " + extra.getName() + " was added, new price: "
                    + extra.getPrice() + " new price of burger: " + this.price);

        } else {
            System.out.println("No further additions allowed");
        }

    }


    public void addExtra(Challenge_Addition extra) {
        this.addExtra(extra,MAX_NUMBER_ADDITIONS);
    }


    }

package de.stefanschade.learning.timbuch.masterclass.ch07;

public class Challenge_Main {

    public static void main(String[] args) {

        Challenge_Addition lettuce = new Challenge_Addition("lettuce", 0.4);
        Challenge_Addition cheese = new Challenge_Addition("cheese", 0.7);
        Challenge_Addition bacon = new Challenge_Addition("bacon", 0.5);
        Challenge_Addition tomato = new Challenge_Addition("tomato", 0.2);
        Challenge_Addition onion = new Challenge_Addition("onion", 0.25);

        Challenge_Hamburger myBurger = new Challenge_Hamburger("Rye", "Ham", 3.50);
        Challenge_HealthyBurger myHealthyBurger = new Challenge_HealthyBurger("Rye", "Ham", 13.50);

        myBurger.addExtra(lettuce);
        myBurger.addExtra(cheese);
        myBurger.addExtra(tomato);


        System.out.println(myBurger.maxItems());
        System.out.println(myBurger.MAX_NUMBER_ADDITIONS);


        myHealthyBurger.addExtra(lettuce);
        myHealthyBurger.addExtra(cheese);
        myHealthyBurger.addExtra(tomato);
        myHealthyBurger.addExtra(onion);


        System.out.println(myHealthyBurger.maxItems());
        System.out.println(myHealthyBurger.MAX_NUMBER_ADDITIONS);



    }

}

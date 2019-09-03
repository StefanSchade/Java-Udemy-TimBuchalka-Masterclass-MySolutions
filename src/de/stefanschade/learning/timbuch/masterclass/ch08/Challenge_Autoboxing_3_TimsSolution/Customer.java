package de.stefanschade.learning.timbuch.masterclass.ch08.Challenge_Autoboxing_3_TimsSolution;

import java.util.ArrayList;

/**
 * Created by dev on 4/09/15.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

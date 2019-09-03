package de.stefanschade.learning.timbuch.masterclass.ch09.Challenge_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Address implements ISaveable {

    private String lastName;
    private String city;

    public Address() {
    }

    public Address(String lastName, String city) {
        this.lastName = lastName.trim();
        this.city = city.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city.trim();
    }

    @Override
    public String toString() {
        return "Name: " + lastName + " / City: " + city;
    }


    @Override
    public List<Object> saveObject() {
        List<Object> storage = new ArrayList<Object>();
        storage.add(this.lastName);
        storage.add(this.city);
        return storage;
    }

    @Override
    public boolean restoreObject(List<Object> objectToBeRestored) {
        if (objectToBeRestored.size() != 2) {
            printCorruptSaveError();
            return false;
        } else {
            Iterator it = objectToBeRestored.iterator();

            try {
                String lastName = (String) it.next();
                String city = (String) it.next();
                this.lastName = lastName;
                this.city = city;
            } catch (ClassCastException ex) {
                printCorruptSaveError();
                this.lastName = "Corrupt Data: " + ex.toString();
                this.city = "Corrupt Data" + ex.toString();

                return false;
            }
            return true;
        }

    }

    private void printCorruptSaveError() {
        System.out.println("The Save-Data cannot be restored!");
    }

}

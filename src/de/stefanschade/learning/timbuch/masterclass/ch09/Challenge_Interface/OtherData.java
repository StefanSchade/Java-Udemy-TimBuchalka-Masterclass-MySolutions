package de.stefanschade.learning.timbuch.masterclass.ch09.Challenge_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OtherData implements ISaveable {

    int intValue;
    String stringValue;

    public OtherData() {
    }

    public OtherData(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }


    @Override
    public List<Object> saveObject() {
        List<Object> storage = new ArrayList<Object>();
        storage.add(this.intValue);
        storage.add(this.stringValue);
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
                int intValue = (Integer) it.next();
                String stringValue = (String) it.next();
                this.intValue = intValue;
                this.stringValue = stringValue;
            } catch (ClassCastException ex) {
                printCorruptSaveError();
                this.intValue = -1;
                this.stringValue = "Corrupt Data" + ex.toString();
                return false;
            }
            return true;
        }

    }

    private void printCorruptSaveError() {
        System.out.println("The Save-Data cannot be restored!");
    }


    @Override
    public String toString() {
        return "Number: " + intValue + " / String: " + stringValue;
    }


}

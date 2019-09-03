package de.stefanschade.learning.timbuch.masterclass.ch09.Challenge_Interface;

import java.util.List;

public class DiskSimulator {

    List<Object> store;

    // this would store to disk
    public void save(ISaveable iSave) {
        this.store = iSave.saveObject();
    }

    // this would load from disk
    public void load(ISaveable emptyObject) {
        boolean restoreSuccessful;

        restoreSuccessful = emptyObject.restoreObject(this.store);

        System.out.print("Restore operation ");
        System.out.print(restoreSuccessful? "sucessfull" : "failed");
        System.out.println("\n");
    }

}

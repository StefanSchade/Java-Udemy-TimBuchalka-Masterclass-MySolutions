package de.stefanschade.learning.timbuch.masterclass.ch09.Challenge_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DiskSimulator2 {


    // this would store to disk
    public static void save(ISaveable iSave) {
        List<Object> store;
        store = iSave.saveObject();

        System.out.println("Saved Data");
        System.out.println("==========");

        Iterator it = store.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    // this would load from disk
    public static void load(ISaveable emptyObject) {
        boolean restoreSuccessful;
        boolean end = false;
        List<Object> store = new ArrayList<Object>();

        Scanner sc = new Scanner(System.in);

        while (!end) {

            System.out.println("Select [String], [Integer] or [End]");

            String choice = sc.nextLine();

            switch (choice) {
                case "String":
                    System.out.println("Enter a String");
                    String valueString = sc.nextLine();
                    store.add(valueString);
                    break;
                case "Integer":
                    System.out.println("Enter an Integer");
                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid Input");
                    } else {
                        int valueInt = sc.nextInt();
                        store.add(valueInt);
                        sc.nextLine();
                    }
                    break;
                case "End":
                    end = true;
                    break;
                default:
                    System.out.println("Illegal Input");
            }

       //     System.out.println("End: " + (end? "true":"false"));

        }

     //  not quite sure how to handle multiple calls of this
     //  sc.close();

        restoreSuccessful = emptyObject.restoreObject(store);

        System.out.print("Restore operation ");
        System.out.print(restoreSuccessful ? "sucessfull" : "failed");
        System.out.println("\n");
    }

}

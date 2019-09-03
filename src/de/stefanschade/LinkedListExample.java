package de.stefanschade;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> data = new LinkedList<String>();

        data.add("One");
        data.add("Two");
        data.add("Three");
        data.add("Four");
        data.add("Five");
        data.add("Six");
        data.add("Seven");
        data.add("Eight");
        data.add("Nine");


        data.addFirst("Eins");

        System.out.println();
        System.out.println("An iterator can only go forward:");
        Iterator<String> iter = data.iterator();
        while (iter.hasNext()) System.out.println("Next Entry: " + iter.next());

        System.out.println();
        System.out.println("A ListIterator can go forward...");
        ListIterator<String> listiter = data.listIterator();
        while (listiter.hasNext())
            System.out.println("Entry on position " + listiter.nextIndex() + ": " + listiter.next());

        System.out.println();
        System.out.println("... and backward");
        while (listiter.hasPrevious())
            System.out.println("Entry on position " + listiter.previousIndex() + ": " + listiter.previous());

        System.out.println();
        System.out.println("Navigate back and forth");
        System.out.println("Entry on position " + listiter.nextIndex() + ": " + listiter.next());
        System.out.println("Entry on position " + listiter.nextIndex() + ": " + listiter.next());
        System.out.println("Entry on position " + listiter.nextIndex() + ": " + listiter.next());
        System.out.println("Entry on position " + listiter.nextIndex() + ": " + listiter.next());

        listiter.previous();

        System.out.println("Entry on position " + listiter.previousIndex() + ": " + listiter.previous());
        System.out.println("Entry on position " + listiter.previousIndex() + ": " + listiter.previous());

        System.out.println("\nNOTICE THE ENTRY TWO WOULD BE DISPLAYED \n" +
                "TWICE WHEN CHANGING DIRECTIONS IF WE DID NOT \n" +
                "ENTER THE EXTRA STATEMENT");


        listiter.set("abc");

        listiter.next();
        listiter.next();
        listiter.next();
        listiter.next();
        listiter.remove();

        System.out.println("\none entry was overwritten \n" +
                "one was removed \n");


        System.out.println();
        System.out.println("An iterator can only go forward:");
        iter = data.iterator();
        while (iter.hasNext()) System.out.println("Next Entry: " + iter.next());


        String stringdata = "a b c d e f g h";

        String[] dataArray = stringdata.split(" ");

        for (String s: dataArray) {
            System.out.println(s);
        }

    }
}

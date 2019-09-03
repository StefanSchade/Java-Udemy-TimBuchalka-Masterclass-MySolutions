package de.stefanschade.learning.timbuch.masterclass.ch09.Challenge_Interface;

public class Main {

    public static void main(String[] args) {

        System.out.println("**** Some Save / Restore Operations on Adress ****");
        System.out.println();
        // generate some addresses to be saved
        Address ad1 = new Address("Schade", "München");
        Address ad2 = new Address("Lehnen", "Langenargen");
        Address ad3 = new Address("Pössel", "Großmonra");
        Address ad4 = new Address("Milicevic", "München");

        // prepare storage
        DiskSimulator ds_a1 = new DiskSimulator();
        DiskSimulator ds_a2 = new DiskSimulator();
        DiskSimulator ds_a3 = new DiskSimulator();
        DiskSimulator ds_a4 = new DiskSimulator();

        // save them to "disk"
        ds_a1.save(ad1);
        ds_a2.save(ad2);
        ds_a3.save(ad3);
        ds_a4.save(ad4);

        // new empty objects
        Address ad5 = new Address();
        Address ad6 = new Address();
        Address ad7 = new Address();
        Address ad8 = new Address();

        // retrieve data
        ds_a1.load(ad5);
        ds_a2.load(ad6);
        ds_a3.load(ad7);
        ds_a4.load(ad8);


        System.out.println("Saved Adress:    " + ad1.toString());
        System.out.println("Restored Adress: " + ad5.toString());
        System.out.println();
        System.out.println("Saved Adress:    " + ad2.toString());
        System.out.println("Restored Adress: " + ad6.toString());
        System.out.println();
        System.out.println("Saved Adress:    " + ad3.toString());
        System.out.println("Restored Adress: " + ad7.toString());
        System.out.println();
        System.out.println("Saved Adress:    " + ad4.toString());
        System.out.println("Restored Adress: " + ad8.toString());
        System.out.println();

        System.out.println("**** Some Save / Restore Operations on Other Data ****");
        System.out.println();
        // other data to be saved
        OtherData od1 = new OtherData(1, "A");
        OtherData od2 = new OtherData(2, "B");

        // storage can be reused
        ds_a1.save(od1);
        ds_a2.save(od2);

        // new empty objects
        OtherData od5 = new OtherData();
        OtherData od6 = new OtherData();

        ds_a1.load(od5);
        ds_a2.load(od6);

        System.out.println("Saved Other Data:    " + od1.toString());
        System.out.println("Restored Other Data: " + od5.toString());
        System.out.println();
        System.out.println("Saved Other Data:    " + od2.toString());
        System.out.println("Restored Other Data: " + od6.toString());
        System.out.println();

        System.out.println("**** restore from incompatible dataset should fail ****");
        System.out.println();
        ds_a1.load(ad5);

        // test second storage

        DiskSimulator2.save(ad5);
        DiskSimulator2.save(od1);

        DiskSimulator2.load(ad1);
        System.out.println("Restored Adress: " + ad1.toString());
        System.out.println();

        DiskSimulator2.load(od1);
        System.out.println("Restored Other Data: " + od1.toString());

    }
}

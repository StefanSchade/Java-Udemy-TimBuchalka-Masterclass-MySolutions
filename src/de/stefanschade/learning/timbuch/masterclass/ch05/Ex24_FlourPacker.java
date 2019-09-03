package de.stefanschade.learning.timbuch.masterclass.ch05;

public class Ex24_FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        // bigPacks 5 Kilos each small packs 1 kilo each

    //    System.out.println("bigCount: "+bigCount+" smallCount: "+smallCount+" goal: "+goal);

        if ((bigCount <0) || (smallCount<0) || (goal<0)) {
            return false; // illegal input
        }

        int bigOpt = goal / 5;
        int smallRequired = goal % 5;

        if(bigCount < bigOpt) {
  //          smallRequired =+ ((bigOpt-bigCount)*5);
            smallRequired = smallRequired + (bigOpt-bigCount)*5;
        }

        if (smallRequired>smallCount) {
            return false;
        } else {


            return true;
        }


    }


    public static void main(String[] args) {

        var input1 = 1;
        var input2 = 2;
        var input3 = 3;

        System.out.println(canPack(input1, input2, input3)?  "ja" : "nein" );

        input1 = 1;
        input2 = 2;
        input3 = 8;

        System.out.println(canPack(input1, input2, input3)?  "ja" : "nein" );

        input1 = 1;
        input2 = 2;
        input3 = 7;

        System.out.println(canPack(input1, input2, input3)?  "ja" : "nein" );

        input1 = 2;
        input2 = 6;
        input3 =16;

        System.out.println(canPack(input1, input2, input3)?  "ja" : "nein" );

        input1 = 2;
        input2 = 6;
        input3 =18;

        System.out.println(canPack(input1, input2, input3)?  "ja" : "nein" );


    }

}

package de.stefanschade.learning.timbuch.masterclass.ch07;

import de.stefanschade.learning.timbuch.masterclass.ch08.Challenge_SortArray;

public class Challenge_Reverse {

    public static void reverse(int[] array) {

        System.out.println("original array");
        Challenge_SortArray.printArray(array);


        boolean evenLength = array.length % 2 == 0;

        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        System.out.println("reversed array");
        Challenge_SortArray.printArray(array);

    }

    public static void itar() {

        String[] array1 = {"abc", "Hallo", "test", "", "X"};

        // itar + tab
        for (int i = 0; i < array1.length; i++) {
            String s = array1[i];
            System.out.println(s);
        }
    }


    public static void main(String[] args) {
        reverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
    }
}



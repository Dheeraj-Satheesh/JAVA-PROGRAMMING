package edu.vit.corejava.basics;

import java.util.ArrayList;

/**
 * Java Arrays Demo
 * 
 * @author Anthoniraj Amalanathan
 * @since 02-Aug-2022
 */

public class array{
    public static void main(String[] args) {
        /*
         * Array is a collection of similar data
         * Syntax: datatype arrayName[] = new datatype[size]\
         * Array index starts with zero and ends with size-1
         */
        int intArray[] = new int[5];
        intArray[0] = 10;
        intArray[1] = 5;
        intArray[2] = 4;

        System.out.println("Parsing Array with Primitive Type");
        /* Parsing Array Values */
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        /* Alternate Syntax to Create an Array in Java */
        int values[] = { 1, 2, 3, 4, 5 };

        /* Two Dimensional Array (2D) */
        int matrixA[][] = { { 1, 2 }, { 3, 4 } };

        /*
         * ArrayList is a Collection Framework Class Used
         * for creating dynamic list of values
         */
        ArrayList<Integer> iValues = new ArrayList<Integer>();
        iValues.add(10);
        iValues.add(20);
        iValues.add(8);

        System.out.println("Parsing ArrayList with Conventional For loop");
        /* Parsing Array List: Conventional Way */
        for (int i = 0; i < iValues.size(); i++) {
            System.out.println(i + "=>" + iValues.get(i));
        }

        System.out.println("Parsing ArrayList using foreach loop");
        /* Parsing Array List: Using foreach loop */
        for (Integer value : iValues) {
            System.out.println(value);
        }

    }
}
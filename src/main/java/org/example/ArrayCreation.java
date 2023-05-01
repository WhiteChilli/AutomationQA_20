package org.example;

import java.util.Random;

public class ArrayCreation {

    public static int[] createRandomArray() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[5];

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
}

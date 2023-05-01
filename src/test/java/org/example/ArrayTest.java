package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.ArrayCreation.createRandomArray;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayTest {

    @Test
    public void ArrayIndexExistsTest()  {
        int[] myArray = createRandomArray();
        Assertions.assertNotNull(myArray[4]);
    }

    @Test
    public void ArrayIndexDoesNotExistTest()  {
        int[] myArray = createRandomArray();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int wrongIndex = myArray[9];
        });
    }

}

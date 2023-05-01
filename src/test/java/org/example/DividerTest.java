package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DividerTest {
    Divider divider = new Divider();

    @Test
    public void testException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
        divider.divideTwoNumbers(10,0);
        });
    }

    @Test
    public void positiveTest() {

        Assertions.assertEquals(5, divider.divideTwoNumbers(10, 2));
    }

}

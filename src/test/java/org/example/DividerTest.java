package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DividerTest {
    Divider divider;

//    @BeforeEach
//    public void create() {
//        divider = new Divider();
//    }

    @Test
    public void testException() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            // Throws an Arithmetic Exception
        divider.divideTwoNumbers(10,0);
        });
    }

    @Test
    public void testNoException() {
        Assertions.assertEquals(4, divider.divideTwoNumbers(18,2));
    }


}

package org.example;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


// @RunWith attaches a runner with the test class to initialize the test data

public class TestDemoTest {

    @Test
    @DisplayName("Exception Test")
    public void testForException() {
        Exception exception = assertThrows(java.lang.NumberFormatException.class, () -> {
            Integer.parseInt(null);
        }); //Tests if the Integer.parseInt method throws an exception

        String expectedMessage = "Cannot parse null string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}
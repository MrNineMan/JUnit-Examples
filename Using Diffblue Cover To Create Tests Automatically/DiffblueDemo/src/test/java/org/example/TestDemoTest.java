package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class TestDemoTest {
    /**
     * Method under test: {@link TestDemo#returnFormattedDate(LocalDateTime)}
     */
    @Test
    void testReturnFormattedDate() {
        assertEquals("01/01/1970", TestDemo.returnFormattedDate(LocalDate.of(1970, 1, 1).atStartOfDay()));
    }
}


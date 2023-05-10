package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class TestDemoTest {
    LocalDateTime ldt = LocalDateTime.now();
    @Test
    @DisplayName("Correct date format")
    void returnFormattedDate() {
        //assertEquals("Today's Date In The Expected Format (dd/MM/yyyy)",TestDemo.returnFormattedDate(ldt)); // Insert today's date
        assertEquals("10/05/2023",TestDemo.returnFormattedDate(ldt));
    }

    @Test
    @DisplayName("Incorrect date format")
    void returnWrongFormat() {
        //assertEquals("Today's Date In The Expected Format (dd/MM/yyyy)",TestDemo.returnFormattedDate(ldt)); // Insert today's date
        assertEquals("2023/10/23",TestDemo.returnFormattedDate(ldt));
    }
}
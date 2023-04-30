package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class TestDemoTest {

    @Test
    @DisplayName("Correct date format")
    void returnFormattedDate() {
        LocalDateTime ldt = LocalDateTime.now();
        assertEquals(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(ldt),TestDemo.returnFormattedDate(ldt));
    }

    @Test
    @DisplayName("Incorrect date format")
    void returnWrongFormat() {
        LocalDateTime ldt = LocalDateTime.now();
        assertEquals(DateTimeFormatter.ofPattern("dd/MM/yyyy HH").format(ldt),TestDemo.returnFormattedDate(ldt));
    }
}
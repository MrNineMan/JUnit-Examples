package org.example;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class TestDemo {
    public static String returnFormattedDate(LocalDateTime ldt) {
        // Simplified Date Format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return dtf.format(ldt);
    }
}

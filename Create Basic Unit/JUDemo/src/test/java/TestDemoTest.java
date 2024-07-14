package org.example;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Test 
import static org.junit.jupiter.api.Assertions.*;

class TestDemoTest {

    @Test

    void returnFormattedDate() {
        LocalDateTime ldt = LocalDateTime.now();

        assertEquals("Today's Date In The Expected format (dd/MM/yyyy)",TestDemo.returnFormattedDate(ldt)); // Insert today's date
        //Example: assertEquals("10/05/2023",TestDemo.returnFormattedDate(ldt));
    }
}

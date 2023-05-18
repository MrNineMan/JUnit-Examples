package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;


public class TestDemoTest {
    @Test
    @DisplayName("Correct date format")
    public void returnFormattedDate() {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        TestDemoService testDemoService = Mockito.mock(TestDemoService.class);
        TestDemo testDemo = new TestDemo();

        Mockito.when(testDemoService.returnFormattedDate(ldt)).thenReturn("01/05/2023"); //Hardcode the date
        testDemo.setTestDemoService(testDemoService);

        assertEquals(testDemo.returnFormattedDate(ldt),dateTimeFormatter.format(ldt));
    }

}
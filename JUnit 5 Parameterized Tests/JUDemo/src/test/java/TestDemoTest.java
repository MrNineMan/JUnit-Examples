package org.example;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.time.LocalDateTime;

import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


// @RunWith attaches a runner with the test class to initialize the test data

public class TestDemoTest {

    @ParameterizedTest
    @ValueSource(strings = {"25/03/2023", "/2023/24/03", "/2023", "25/03/2023", "24/03", "32/24/03"})
    @DisplayName("Correct date format")
    public void returnFormattedDate(String date) {
        TestDemoService testDemoService = Mockito.mock(TestDemoService.class);
        LocalDateTime ldt = LocalDateTime.now();
        TestDemo testDemo = new TestDemo();
        testDemo.setTestDemoService(testDemoService);
        when(testDemoService.returnFormattedDate(ldt)).thenReturn("25/03/2023"); //Hardcode/mock the date
        assertEquals(testDemo.returnFormattedDate(ldt),date);
    }

}
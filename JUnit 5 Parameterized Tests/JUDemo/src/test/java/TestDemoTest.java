package org.example;

import static org.mockito.Mockito.lenient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.api.extension.TestWatcher;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;


// @RunWith attaches a runner with the test class to initialize the test data
@ExtendWith(MockitoExtension.class)
public class TestDemoTester {

    @RegisterExtension
    public DemoTestWatcher watcher = new DemoTestWatcher();
    //@InjectMocks annotation is used to create and inject the mock object
    @InjectMocks
    TestDemo testDemo = new TestDemo();

    //@Mock annotation is used to create the mock object to be injected
    @Mock
    TestDemoService testDemoService;


    @Test
    @DisplayName("Correct date format")
    public void returnFormattedDate() {

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        lenient().when(testDemoService.returnFormattedDate(ldt)).thenReturn("24/03/2023"); //Hardcode the date

        assertEquals(testDemo.returnFormattedDate(ldt),dateTimeFormatter.format(ldt));
    }

    @ParameterizedTest
    @ValueSource(strings = {"25/03/2023", "/2023/24/03", "/2023", "25/03/2023", "24/03", "32/24/03"})
    @DisplayName("Correct date format")
    public void returnFormattedDate(String date) {

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        lenient().when(testDemoService.returnFormattedDate(ldt)).thenReturn("25/03/2023"); //Hardcode/mock the date

        assertEquals(testDemo.returnFormattedDate(ldt),date);
    }

    public class DemoTestWatcher implements TestWatcher {

        @Override
        public void testSuccessful(ExtensionContext context) {
            System.out.println("Test Successful");

        }

        @Override
        public void testFailed(ExtensionContext context, Throwable cause) {
            System.out.println("Test Failed");
        }
    }

}
package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.api.extension.TestWatcher;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class TestDemoTest {
    @RegisterExtension
    public DemoTestWatcher watcher = new DemoTestWatcher();

    @Test
    @DisplayName("Correct date format")
    void returnFormattedDate() {
        LocalDateTime ldt = LocalDateTime.now();
        assertEquals(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(ldt),TestDemo.returnFormattedDate(ldt));
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
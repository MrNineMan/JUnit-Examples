package org.example;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class TestDemo {
    private TestDemoService testDemoService;

    //Sets and assigns the mock object
    public void setTestDemoService(TestDemoService testDemoService){
        this.testDemoService = testDemoService;
    }

    //Provides a wrapper method for the TestDemoServices's returnFormattedDate method
    public String returnFormattedDate(LocalDateTime ldt) {
        return testDemoService.returnFormattedDate(ldt);

    }
}

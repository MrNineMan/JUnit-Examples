package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDemoServiceImpl implements TestDemoService {
    @Override
    public String returnFormattedDate(LocalDateTime ldt) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dateTimeFormatter.format(ldt);
    }

}

package se.lexicon.simon;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();

        String customFormat = today.format(DateTimeFormatter.ofPattern("eeee dd MMMM yyyy hh mm ss"));
        System.out.println("customFormat = " + customFormat);


    }
}

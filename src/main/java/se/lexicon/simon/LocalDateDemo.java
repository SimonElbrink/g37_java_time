package se.lexicon.simon;

import java.time.*;
import java.time.chrono.Era;

public class LocalDateDemo {


    public static void main(String[] args) {


        LocalDate today = LocalDate.now();

        System.out.println("today = " + today);

        DayOfWeek today_Day = today.getDayOfWeek();
        System.out.println("today_Day = " + today_Day);

        Month today_month = today.getMonth();
        System.out.println("today_month = " + today_month);

        Era era = today.getEra();
        System.out.println("era.toString() = " + era.toString());

        boolean isTodayLeapYear = today.isLeapYear();
        System.out.println("isTodayLeapYear = " + isTodayLeapYear);

        LocalDate birthDate = LocalDate.parse("2021-03-18");

        Year thisYear = Year.now();
        LocalDate christmasEve = LocalDate.of(thisYear.getValue(),Month.DECEMBER, 24);


        Period ofMonths = Period.ofMonths(9);
        System.out.println("ofMonths = " + ofMonths);

        LocalDate expectedBirthDate = LocalDate.of(2021,11,6);
        System.out.println("expectedBirthDate.minus(ofMonths) = " + expectedBirthDate.minus(ofMonths));


    }
    
    
}

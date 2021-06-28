package se.lexicon.simon;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExamples {


    public static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();

        LocalTime lunch = LocalTime.NOON;
        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;

        LocalTime startOfDay = LocalTime.of(8, 30);
        LocalTime endOfDay = LocalTime.parse("16:30");


        System.out.println("timeNow = " + timeNow);

        LocalTime todayMinutes = timeNow.truncatedTo(ChronoUnit.MINUTES);
        System.out.println("todayMinutes = " + todayMinutes);


        LocalTime plusHour = todayMinutes.plusHours(1);
        System.out.println("plusHour = " + plusHour);

        LocalTime plus_30_minutes = todayMinutes.plus(30, ChronoUnit.MINUTES);

        System.out.println("plus_30_minutes = " + plus_30_minutes);


        todayMinutes.plus(Duration.ofHours(60));


        Duration duration = Duration.between(timeNow, lunch);
        System.out.println("duration = " + duration.getSeconds());


    }

}

package com.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class datetime {
    public static void main(String[] args) {
/*
        // Old
        Calendar now = Calendar.getInstance();
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);
        now.set(Calendar.MILLISECOND, 0);
        Date truncated = now.getTime();

        // New
        LocalTime truncated1 = LocalTime.now().truncatedTo(ChronoUnit.HOURS);
*/






        // Old
        GregorianCalendar calendar = new GregorianCalendar();
        Date now = new Date();
        calendar.add(Calendar.HOUR, 1);
        Date hourLater = calendar.getTime();
        long elapsed = hourLater.getTime() - now.getTime();

        // New
        LocalDateTime now1 = LocalDateTime.now();
        LocalDateTime hourLater1 = LocalDateTime.now().plusHours(1);
        Duration span = Duration.between(now1, hourLater1);





        System.out.println(now);
        System.out.println(elapsed);
        System.out.println(span);
    }
}
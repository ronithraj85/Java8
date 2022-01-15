package com.cts.udemy;

import java.time.*;

public class JodaAPIEx {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());
        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        LocalDateTime ldt = LocalDateTime.of(1996, Month.JANUARY, 12, 10, 45,55,351);
        System.out.println(ldt);
        System.out.println(ldt.plusMonths(2));
        System.out.println(ldt.plusDays(5));
        System.out.println(ldt.minusMonths(1));
        Period p = Period.between(LocalDate.of(1996,Month.JANUARY,12), LocalDate.now());
        System.out.println(p.getDays()+" , "+p.getYears());
        Year yr = Year.of(1996);
        System.out.println(yr.isLeap());
        ZoneId zne= ZoneId.systemDefault();
        System.out.println(zne);
        ZoneId zla = ZoneId.of("America/Los_Angeles");
        ZonedDateTime ddz =   ZonedDateTime.now(zla);
        System.out.println(ddz);
    }
}

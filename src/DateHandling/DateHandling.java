package DateHandling;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateHandling {

// All local date Local time local date time are immutable classes
// all modification will return new object

public static void main(String [] args)
{
LocalDate today = LocalDate.now();
System.out.println("Current date: " + today);
LocalDateTime currentDateTime = LocalDateTime.now();
System.out.println("Current DateTime : " + currentDateTime);
LocalTime CurrentTime =LocalTime.now();
System.out.println("Current Time: " + CurrentTime);

// Get characteristics of a date
System.out.println("today.getDayOfWeek()  : " + today.getDayOfWeek());
System.out.println("today.getDayOfMonth() : " + today.getDayOfMonth());
System.out.println("today.getDayOfYear()  : " + today.getDayOfYear());
System.out.println("today.getYear()       : " + today.getYear());
System.out.println("today.getMonth()      : " + today.getMonth());
System.out.println("today.getMonthValue() : " + today.getMonthValue());


System.out.println("today.isLeafYear()    : " + today.isLeapYear());

System.out.println("Total Days in a year  : " + today.lengthOfYear());
System.out.println("total Days in a month : " + today.lengthOfMonth());

// Operation on date/time
System.out.println("Days after 10 days    : " + today.plusDays(10));
System.out.println("Days after 100 days   : " + today.plusDays(100));
System.out.println("Days after 1000 days  : " + today.plusDays(1000));
System.out.println("Weeks after 5 days    : " + today.plusWeeks(5));
System.out.println("Days after 12 months  : " + today.plusMonths(12));
System.out.println("Days after 2 years   : " + today.plusYears(12));


System.out.println("Days before 10 days   : " + today.minusDays(10));
System.out.println("Days before 100 days  : " + today.minusDays(100));
System.out.println("Days before 1000 days : " + today.minusDays(1000));
System.out.println("Weeks before 5 weeks  : " + today.minusWeeks(5));
System.out.println("Days before 12 months : " + today.minusWeeks(12));
System.out.println("Days before 12 years  : " + today.minusYears(12));



// can create instance of new date as bellow
LocalDate hundredYearsBefore = today.minusYears(100);
System.out.println("100 years before      : " + hundredYearsBefore);
// today will not change though
System.out.println("today                 : " + today);


// LocalTime operation: Similar operation as that of Local time are present
// you can add or subtract hours, minutes,seconds, Nanos,

LocalTime now = LocalTime.now();
System.out.println("Current time          : " + now);
System.out.println("now getHour           : " + now.getHour());
System.out.println("now.getMinute         : " + now.getMinute());
System.out.println("now.getSecond         : " + now.getSecond());
System.out.println("now.getNano           : " + now.getNano());

System.out.println("today getChronology   : " + today.getChronology());



// compare and set dates
LocalDate yesterday = LocalDate.of(2023, 5, 3);    //05 is not allowed here
System.out.println("yesterday: " + yesterday);


System.out.println("today.withYear(2012) : " + today.withYear(2012));
System.out.println("today.withDayOfMonth(21) : " + today.withDayOfMonth(21));
System.out.println("today.Month(3) : " + today.withMonth(3));
System.out.println("today.withDayOfYear(11) : " + today.withDayOfYear(11));
System.out.println("today.withDayOfYear(120) : " + today.withDayOfYear(120));
System.out.println("today.withDayOfYear(60) : " + today.withDayOfYear(60));


// compare dates

System.out.println("today      : " + today);
System.out.println("yesterday      : " + yesterday);


System.out.println("today.isBefore(yesterday) : " + today.isBefore (yesterday));  // false
System.out.println("today.isAfter(yesterday): " + today.isAfter (yesterday));  // true
System.out.println("yesterday.isBefore(today): " + yesterday.isBefore (today));  // false
System.out.println("yesterday.isAfter(today): " + today.isAfter (today));  // false




}

}
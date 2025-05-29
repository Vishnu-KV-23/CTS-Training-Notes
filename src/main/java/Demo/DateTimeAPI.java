package demo;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeAPi {
  public static void main(String[] args) {
    /**
     * Java Date Time API, from version 8
     * 
     * LocalDate - Date without time
     * LocalTime - Time without date
     * LocalDateTime - Date and Time
     * Instant - Timestamp in UTC
     * Duration - Time based value
     * Period - Date based value
     * DateTimeFormatter - Formating date and time
     */

    System.out.println("Local Date: " + LocalDate.now());
    System.out.println("Local Time: " + LocalTime.now());
    var dateTime = LocalDateTime.now();
    System.out.println("Local DateTime: " + dateTime);
    System.out.println("Instant: " + Instant.now());

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyy HH:mm a");
    System.out.println("DateTime: " + dateTime);
    // format methods returns a string, by formatting the local date time using date
    // formatter
    System.out.println("Formatted: " + dateTime.format(formatter));
    // parse method return a LocalDateTime from string using the formatter object
    System.out.println(LocalDateTime.parse("22-May-2025 10:40 am", formatter));

    LocalDate today = LocalDate.now();
    System.out.println("Next Week: " + today.plusWeeks(1));
    System.out.println("Last Month: " + today.minusMonths(1));
    System.out.println(today.isBefore(LocalDate.of(2025, 5, 25)));

    LocalDate startDate = LocalDate.of(2025, 5, 20);
    LocalDate endDate = LocalDate.of(2025, 6, 9);

    Period period = Period.between(startDate, endDate);
    System.out.println("Days: " + period.getDays());

    LocalTime startTime = LocalTime.of(19, 0, 0);
    LocalTime endTime = LocalTime.of(23, 30, 15);

    Duration duration = Duration.between(startTime, endTime);
    System.out.printf("Hours: %s, minutes %s%n", duration.toHours(), duration.toMinutes());

  }
}

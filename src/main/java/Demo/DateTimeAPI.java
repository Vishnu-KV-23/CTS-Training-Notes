package Demo;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {

    public static void main(String[] args)
    {
        /**
         * Java date time API , from version 8
         * LocalDate - Date without time
         * LocalTime - Time without date
         * LocalTimeDate - Date and Time
         * Instant
         * duration
         * period
         * DateTimeFormatter
         */

        System.out.println("Local Date:"+ LocalDate.now());
        System.out.println("Local Time:"+ LocalTime.now());
        System.out.println("Local DateTime:"+ LocalDateTime.now());
        System.out.println("Instant:"+ Instant.now());
      //  System.out.println(String.format(String.format("Formatted:" + dateTime.format(formatter) )));
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern()
     //   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyy HH:mm a");
      //  System.out.println("DateTime:"+ dateTime);



    }
}

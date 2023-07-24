package dateconversions.app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2023-07-23");
        LocalDateTime dt01 = LocalDateTime.parse("2023-07-23T23:45:12");
        Instant dt02 = Instant.parse("2023-07-18T01:15:15Z");
        Instant dt03 = Instant.parse("2023-07-18T01:15:15-03:00");

        // To convert an Instant type into a LocalDateTime type we need to specify the time zone. Timezones are available
        // on documentation, but we can also get them via code using a built-in method from the "ZoneId" class:
        /*for(String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }*/

        LocalDate result1 = LocalDate.ofInstant(dt02, ZoneId.systemDefault());
        LocalDate result2 = LocalDate.ofInstant(dt02, ZoneId.of("UTC"));
        LocalDateTime result3 = LocalDateTime.ofInstant(dt02, ZoneId.systemDefault());
        LocalDateTime result4 = LocalDateTime.ofInstant(dt03, ZoneId.of("Portugal"));

        System.out.println("Instant to LocalDate (System time) = " + result1);
        System.out.println("Instant to LocalDate (UTC -0) = " + result2);
        System.out.println("Instant to LocalDateTime (System time) = " + result3);
        System.out.println("Instant to LocalDateTime (Portugal) = " + result4);


        // Getting day, month, hour, seconds and etc. separadly:

        System.out.println("d01 day: " + d01.getDayOfMonth());
        System.out.println("d01 month: " + d01.getMonth());
        System.out.println("dt01 year: " + dt01.getYear());
        System.out.println("dt01 hour: " + dt01.getHour());
        System.out.println("dt01 seconds: " + dt01.getSecond());
    }
}

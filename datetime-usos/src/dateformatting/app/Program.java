package dateformatting.app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2023-07-23");
        LocalDateTime dt01 = LocalDateTime.parse("2023-07-23T23:45:12");
        Instant dt02 = Instant.parse("2023-07-18T15:15:15Z");
        Instant dt03 = Instant.parse("2023-07-18T15:15:15-03:00");

        DateTimeFormatter formatter01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatter03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // When creating a formatter for an instant
        // We need to provide it with the information regarding the desired timezone. In this case, we used the timezone associated to any machine this program runs in.

        System.out.println("d01 = " + d01.format(formatter01));
        System.out.println("d01 = " + formatter01.format(d01));
        // Both of the lines above do the same thing

        System.out.println("dt01 = " + dt01.format(formatter01));
        System.out.println("dt01 = " + dt01.format(formatter02));
        // DateTimes can also be printed simply as dates if we wish to.

        // As for the Instant type, things work a BIT differently:
        System.out.println("dt02 = " + formatter03.format(dt02));
        System.out.println("dt03 = " + formatter03.format(dt03));
        // Since the Instant type doesn't have the "format" method, we need to use the one associated with the DateTimeFormatter type and make sure the formatter
        // specifies the timezone.
    }
}

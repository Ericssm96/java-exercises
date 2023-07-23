package stringparsing.app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

// Strings para datas.
public class StringParsing {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2023-07-23");
        LocalDateTime dt01 = LocalDateTime.parse("2023-07-22T22:45:11");
        Instant dt02 = Instant.parse("2023-07-15T16:45:11Z");
        Instant dt03 = Instant.parse("2023-07-15T16:45:11-03:00");

        System.out.println(d01);
        System.out.println(dt01);
        System.out.println(dt02);
        System.out.println(dt03);
    }
}

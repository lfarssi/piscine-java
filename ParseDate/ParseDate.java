import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        String[] parts = stringDate.split(" ");
        if (parts.length == 4) {
            parts[0] = parts[0].substring(0, 1).toUpperCase() + parts[0].substring(1);
            parts[2] = parts[2].substring(0, 1).toUpperCase() + parts[2].substring(1);
            stringDate = String.join(" ", parts);
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.ENGLISH);
        return LocalDate.parse(stringDate, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        stringDate = stringDate.replace("in the evening", "PM");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh 'hours 'a', 'mm 'minutes and 'ss 'seconds'", Locale.ENGLISH);
        return LocalTime.parse(stringDate, formatter);
    }

}
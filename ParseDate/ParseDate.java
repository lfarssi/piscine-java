import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null) return null;
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null) return null;
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("EEEE d MMMM yyyy")
                .toFormatter(Locale.ENGLISH);
        return LocalDate.parse(stringDate, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null) return null;
        String lower = stringDate.toLowerCase();
        int hours = Integer.parseInt(lower.split(" hours")[0].trim());
        if (lower.contains("evening") || lower.contains("afternoon") || lower.contains("night")) {
            hours = (hours == 12) ? 12 : hours + 12;
        } else if (lower.contains("morning") && hours == 12) {
            hours = 0;
        }
        String minStr = lower.split("hours")[1].split(" minutes")[0].replaceAll("[^0-9]", "").trim();
        int minutes = minStr.isEmpty() ? 0 : Integer.parseInt(minStr);
        String secStr = lower.split(" minutes")[1].replaceAll("[^0-9]", "").trim();
        int seconds = secStr.isEmpty() ? 0 : Integer.parseInt(secStr);
        return LocalTime.of(hours, minutes, seconds);
    }
}
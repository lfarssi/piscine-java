import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DifferenceBetweenDate {

    public static Duration durationBetweenTime(LocalTime localTime1, LocalTime localTime2) {
        return Duration.between(localTime1, localTime2).abs();
    }

    public static Period periodBetweenDate(LocalDate date1, LocalDate date2) {
        LocalDate start = date1.isBefore(date2) ? date1 : date2;
        LocalDate end = date1.isBefore(date2) ? date2 : date1;
        return Period.between(start, end);
    }

    public static Long numberOfHoursBetweenDateTime(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        return Duration.between(dateTime1, dateTime2).abs().toHours();
    }

}
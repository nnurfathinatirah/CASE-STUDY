import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeHandler {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format the date and time using a specific pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        // Display the formatted date and time
        System.out.println("Current date and time: " + formattedDateTime);
    }
}
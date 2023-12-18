import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeHandler {

    public static void main(String[] args) {

        Date dateTime = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat timeFormatter = new SimpleDateFormat("hh:mm a");

        System.out.println("Date: " + dateFormatter.format(dateTime));
        System.out.println("Time: " + timeFormatter.format(dateTime));
    }
}
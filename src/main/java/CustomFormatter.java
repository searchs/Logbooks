import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * Custom Formatter for Log handling
 */
public class CustomFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        String level = record.getLevel().getName();
        String loggerName = record.getLoggerName();
        String message = record.getMessage();
        String dateTime = formatDate(record.getMillis());
        return level + " | " + message + " | " + dateTime + "\n";

    }


    private String formatDate(long millisecs) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy HH:mm:ss");
        Date date = new Date(millisecs);
        return dateFormat.format(date);
    }


}

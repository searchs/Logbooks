import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Handler;
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


    @Override
    public String getHead(Handler h) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html style='margin: 0 auto;'>");
        stringBuffer.append("<head>");
        stringBuffer.append("<title>");
        stringBuffer.append("Log File");
        stringBuffer.append("</title>");
        stringBuffer.append("</head>");
        stringBuffer.append("<body style='margin: 0 auto; padding: 10px; font-family: Arial;'>");
        stringBuffer.append("<table border='1'>");
        return stringBuffer.toString();


    }


    @Override
    public String getTail(Handler h) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("</table>");
        stringBuffer.append("</body>");
        stringBuffer.append("</html>");
        return stringBuffer.toString();

    }

}

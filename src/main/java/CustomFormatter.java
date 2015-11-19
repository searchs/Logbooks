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
        stringBuffer.append("<html>");
        stringBuffer.append("<head>");
        stringBuffer.append("<title>");
        stringBuffer.append("Log File");
        stringBuffer.append("</title>");
        stringBuffer.append("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\" integrity=\"sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==\" crossorigin=\"anonymous\">");
        stringBuffer.append("</head>");
        stringBuffer.append("<body class=\"container\">");
        stringBuffer.append("<hr />");
        stringBuffer.append("<table class=\"table table-striped\">");
        return stringBuffer.toString();


    }


    @Override
    public String getTail(Handler h) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("</table>");
        stringBuffer.append("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\" integrity=\"sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==\" crossorigin=\"anonymous\">");
        stringBuffer.append("</script>");
        stringBuffer.append("</body>");
        stringBuffer.append("</html>");
        return stringBuffer.toString();

    }

}

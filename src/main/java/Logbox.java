import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Logging Mechanism
 *
 *You can define/refine the logging level at the system level by updating
 * the logging.properties file in $AJVA_HOME/jre/lib
 *
 * Log Handlers
 * ConsoleHandler
 * StreamHandler
 * FileHandler
 * SocketHandler
 * MemoryHandler
 */
public class Logbox {


    private final static Logger LOGGER = Logger.getLogger(Logbox.class.getName());

    public static void main(String[] args) {
        FileHandler logFile = null;

        try {

            logFile = new FileHandler("test_logs.html");
//            logFile = new FileHandler("test_logs.txt", true); //false will delete existing file
//            logFile.setFormatter(new SimpleFormatter()); //default
            logFile.setFormatter(new CustomFormatter());
            LOGGER.addHandler(logFile);
            int a, b;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a: ");
            a = scanner.nextInt();
            System.out.println("Enter b:");
            b = scanner.nextInt();
            if (a < 2) {
                LOGGER.log(Level.WARNING, "Too close to 0");
            } else {
                LOGGER.log(Level.INFO, "Data is actually safe");
            }

            int c = b / a;
            System.out.println(c);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }

    }
}
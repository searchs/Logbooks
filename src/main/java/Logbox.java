import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Logging Mechanism
 */
public class Logbox {


    private final static Logger LOGGER = Logger.getLogger(Logbox.class.getName());

    public static void main(String[] args) {

        try {
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
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }

    }
}
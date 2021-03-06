import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Handling Exceptions
 * Rules:
 * Checked Exceptions e.g. IO or missing file exceptions must be put in a try-catch
 */
public class ExceptionBox {

    public void arithException() {

        try {

            int a = 0;
            int b = 10;
            int c = b / a;

            System.out.println(c);
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        } finally {
            System.out.println("Finally something that always gets done!");
        }


    }


    public void calcException() throws ArithmeticException {

        int e = 0;
        int f = 10;

        if (e == 0) {
            throw new ArithmeticException();

        }

        if (f < 1) {
            throw new ArithmeticException();
        }

        int g = f / e;

    }


    public void throwException() throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("file.txt");

    }


    public void java7TryCatch() throws FileNotFoundException {


        try (FileInputStream fis = new FileInputStream("file.txt")) {
            fis.read();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void myOwnException() {
//        Checked Exception extends Exception

//    Runtime exception extends RuntimeException

    }


}

import java.util.Scanner;

/**
 * Created by director on 19/11/2015.
 */
public class UtilityBox {

    public static void main(String[] args) {
        try {
            usingMyPersonalException();
        } catch (PersonalException e) {

            e.showException();
        }

    }


    static void usingMyPersonalException() throws PersonalException {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b:");
        b = scanner.nextInt();


        if (a == 0) {
            throw new PersonalException(a, "Dangerous 0 value");
        }

        int c = b / a;


    }


}

import java.util.Scanner;

/**
 * Created by director on 19/11/2015.
 */
public class OwnAssertions {


    public static void main(String[] args) {


        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b:");
        b = scanner.nextInt();

        assert a > 2: "Should be more than 2!";

        int c = b / a;

    }


}

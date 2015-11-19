/**

 */
public class PersonalException extends Exception {

    private int value;
    private String message;

    public PersonalException(int value, String message) {
        this.value = value;
        this.message = message;
    }

    public void showException(){
        System.out.println(message + " " + value);
    }

}

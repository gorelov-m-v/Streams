package validation;

public class UserInputException extends Exception {


    public UserInputException (String message) {
        super(message);
    }

}

class Practicum1 {
    public static void main(final String[] args) {
        final UserInputException userInputException = new UserInputException("Ошибка ввода!");
        System.out.println(userInputException.getMessage());
    }
}
package practicum.validators;

public interface Validator {
    void validate(String value) throws ValidateException;
}
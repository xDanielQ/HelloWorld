package pl.sda.zadania_05_25.chain;

public interface PasswordValidator {

    void validate(String stringToValidate) throws PasswordValidationException;
}

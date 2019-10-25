package pl.sda.zadania_05_25.chain;

public class MinimumLengthPasswordValidator implements PasswordValidator {

    public void validate(String stringToValidate) throws PasswordValidationException {
        if (stringToValidate.length() < 10) {
            throw new PasswordValidationException("Password requires at least 10 characters");
        }
    }
}

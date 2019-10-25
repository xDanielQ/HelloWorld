package pl.sda.zadania_05_25.chain;

public class MaximumLengthPasswordValidator implements PasswordValidator{
    public void validate(String stringToValidate) throws PasswordValidationException {
        if (stringToValidate.length() > 20) {
            throw new PasswordValidationException("Maximum password length is 20!");
        }
    }
}

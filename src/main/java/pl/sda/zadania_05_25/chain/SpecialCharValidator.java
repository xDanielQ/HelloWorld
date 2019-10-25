package pl.sda.zadania_05_25.chain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharValidator implements PasswordValidator{


    public void validate(String stringToValidate) throws PasswordValidationException {
        boolean hasSpecialChar = false;
        Pattern compiledPattern = Pattern.compile("[^a-zA-Z0-9_]");
        Matcher matcher = compiledPattern.matcher(stringToValidate);


    }
}

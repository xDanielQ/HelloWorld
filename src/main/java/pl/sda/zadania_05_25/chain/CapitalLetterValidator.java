package pl.sda.zadania_05_25.chain;

public class CapitalLetterValidator implements PasswordValidator {

    public void validate(String stringToValidate) throws PasswordValidationException {

        boolean hasAnyUpperCase = false;
        for (int i = 0; i < stringToValidate.length(); i++) {
            Character currentChar = stringToValidate.charAt(i);
            if (!hasAnyUpperCase) {
                hasAnyUpperCase = Character.isUpperCase(currentChar);
            }


        }
        if (hasAnyUpperCase) {
            return;
        } else {
            throw new PasswordValidationException("Required upper case letter!");
        }

    }
}



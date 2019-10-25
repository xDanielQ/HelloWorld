package pl.sda.zadania_05_25.chain;

import java.util.ArrayList;
import java.util.List;

public class ChainMain {

    public static void main(String[] args) {
        List<PasswordValidator> validators = new ArrayList<PasswordValidator>();
        validators.add(new AlphanumericPasswordValidator());
        validators.add(new MinimumLengthPasswordValidator());
        validators.add(new MaximumLengthPasswordValidator());
        validators.add(new CapitalLetterValidator());

        LoginClient client = new LoginClient(validators);
        client.login("John", "123456sdfEsdfsdfa");
    }
}

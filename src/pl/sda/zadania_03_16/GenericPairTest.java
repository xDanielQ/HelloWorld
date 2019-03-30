package pl.sda.zadania_03_16;

import pl.sda.zadania_03_10.Employer;
import pl.sda.zadania_03_10.Person;

public class GenericPairTest {

    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski");
        Employer employer = new Employer("Tomasz", "Nowak", "SDA");
        GenericPair<Person, Employer> pair = new GenericPair<>(person, employer);
        Person a = pair.getA();
        Employer b = pair.getB();
    }

    public void test(GenericPair<?, ?> wej){
       wej.getA();
       wej.getB();

    }
}

package pl.sda.zadania_03_16;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod:");
        String code = scanner.nextLine();
        boolean valid = matches(code);
        if(valid){
            System.out.println(code + " Podany kod jest poprawny");
        }else {
            System.out.println("Podany kod jest niepoprawny. Podaj kod w formacie XX-XXX");
        }


    }

    public static boolean matches(String wej){//sprawdzanie wyrażen regularnych
        Pattern pattern = Pattern.compile("[0-9]{2}-[0-9]{3}");   //ustawienie schematu do którego będą porównywane wprowadzone wartości
        Matcher matcher = pattern.matcher(wej);                  //sprawdzenie czy podane wartości (w tym wyadku wprowadzone przez scanner)
                                                                //są zgodne z podanym wyżej schematem
        return matcher.matches();
    }
}

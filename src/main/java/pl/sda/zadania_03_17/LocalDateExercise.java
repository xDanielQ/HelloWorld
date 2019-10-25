package pl.sda.zadania_03_17;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class LocalDateExercise {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2019, 3,  16);
        LocalDate date2 = LocalDate.of(2019, 8,  18);
        if (checkDates(date)){
            System.out.println("Podana data jest wcześniejsza niż obecna");
        } else {
            System.out.println("Podana data jest późniejsza niż obecna");
        }
        System.out.println(datePeriod(date, date2));
    }

    public static boolean checkDates (LocalDate date){


        return date.isBefore(LocalDate.now());
    }

    public static long datePeriod (LocalDate date, LocalDate date2){
        return Duration.between(date.atStartOfDay(), date2.atStartOfDay()).toDays();
    }

}

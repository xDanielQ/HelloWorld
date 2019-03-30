package pl.sda.Pd.Zjazd2;

import java.util.Scanner;

public class Zad3Scanner {
    public static void main(String[] args) {
        System.out.println("Wybierz figurę nr.: " + '\n' +
                "1. Prostokąt" + '\n' +
                "2. Kwadrat" + '\n' +
                "3. Koło" + '\n' +
                "4. Trójkąt");
        System.out.println("Podaj numer:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 1 && a <= 4) {
            switch (a) {
                case 1: {
                    System.out.println("Podaj bok a:");
                    int x = scanner.nextInt();
                    System.out.println("Podaj bok b:");
                    int y = scanner.nextInt();
                    System.out.println("Pole prostokąta o bokach a=" + x + " i  b=" + y + " wynosi: " + x * y);
                    System.out.println("Obwód prostokąta o bokach a=" + x + " i  b=" + y + " wynosi: " + (x + y) * 2);
                }
                case 2: {
                    System.out.println("Podaj bok a:");
                    int x = scanner.nextInt();
                    System.out.println("Pole kwadratu o bokach a=" + x + " wynosi: " + x * x);
                    System.out.println("Obwód kwadratu o bokach a=" + x + " wynosi: " + x * 4);
                }
                case 3: {
                    System.out.println("Podaj promień:");
                    int x = scanner.nextInt();
                    System.out.println("Pole koła o promieniu r=" + x + " wynosi: " + Math.PI + (x * x));
                    System.out.println("Obwód koła o promieniu r=" + x + " wynosi: " + 2 * Math.PI * x);
                }
                case 4: {
                    System.out.println("Podaj długość boku a:");
                    int d = scanner.nextInt();
                    System.out.println("Podaj długość boku b:");
                    int e = scanner.nextInt();
                    System.out.println("Podaj długość boku c:");
                    int f = scanner.nextInt();
                    System.out.println("Podaj wysokość h:");
                    int y = scanner.nextInt();
                    System.out.println("Pole trójkąta o bokach a=" + d + " i  h=" + y + " wynosi: " + d * y / 2);
                    System.out.println("Obwód trójkąta o bokach a=" + d + " i  b=" + e + "i c= " + f + " wynosi: " + d + e + f);
                }
            }
        }else{
                System.out.println("Podaj poprawną wartość");
            }

        }
    }

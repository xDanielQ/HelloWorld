package pl.sda.zadania_03_31;

public class Silnia {
// Rekurencja jest szybsza od iteracji (trzeba wiedzieć jak działa żeby z niej skorzystać)
        /* metoda rekurencyjna */
        public int silnia(int i)
        {
            if (i == 0)
                return 1;
            else
                return i * silnia(i - 1);
        }

        static public void main(String argv[])
        {
            /* deklaracja zmiennej wraz z utworzeniem jej wartosci */
            Silnia s = new Silnia();

            /* wywolanie zdefiniowanej metody */
            System.out.println(s.silnia(19));
        }

}

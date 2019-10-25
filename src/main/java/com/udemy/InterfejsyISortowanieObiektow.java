package com.udemy;

import java.util.Arrays;

public class InterfejsyISortowanieObiektow {
    public static void main(String[] args) {

        nazwaInterfejsu a = new Pracownik();
        ((Pracownik)a).getWynagrodzenie();
        System.out.println(nazwaInterfejsu.PI);
int[] tab = {3, -5, 13};

        Arrays.sort(tab);
    }
    interface nazwaInterfejsu {  //interfejs tak jak class moze byc tylko jeden jako publiczny w pliku
        double PI = 3.14; // public statatic final
        void cos();   //public abstract

    }

    static class Pracownik implements nazwaInterfejsu {

        @Override
        public void cos() {
            throw new UnsupportedOperationException();
        }
        private double wynagrodzenie;
        public double getWynagrodzenie(){
            return this.wynagrodzenie;
        }

    }
}

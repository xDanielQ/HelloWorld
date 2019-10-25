package com.codewars;

public class disemvowel {
    public static void main(String[] args) {
         System.out.println(disemvowelT("This website is for losers LOL"));;

    }

    private static String disemvowelT(String str){

        return str
                .replaceAll("i", "")
                .replaceAll("o", "")
                .replaceAll("u", "")
                .replaceAll("a", "")
                .replaceAll("e", "")
                .replaceAll("y", "")
                .replaceAll("I", "")
                .replaceAll("O", "")
                .replaceAll("U", "")
                .replaceAll("A", "")
                .replaceAll("E", "")
                .replaceAll("Y", "");
    }
}

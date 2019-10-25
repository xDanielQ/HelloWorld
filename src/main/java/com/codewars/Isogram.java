package com.codewars;


public class Isogram {
    public static void main(String[] args) {
System.out.println(isIsogram("moose"));
    }



    public static boolean isIsogram(String str){
        char inputString[] = str.toLowerCase().toCharArray();
        int z =0;
        for(int i = 0; i < inputString.length-2;i++ ){

            for(int j = i+1; j <= inputString.length-1; j++){
                if(inputString[i] == inputString[j]){
                    z++;
                }

            }

        }
        return z == 0;
    }



}

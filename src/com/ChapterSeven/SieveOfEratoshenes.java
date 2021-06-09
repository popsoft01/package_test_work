package com.ChapterSeven;

import java.util.Arrays;

public class SieveOfEratoshenes {
    public boolean isPrime(int number){
        for (int i = 1; i <= number/2; i++){
            if (number % i != 0)
                return true;
        }
        return false;
    }
    public boolean Eratostheses(boolean[] array) {
        SieveOfEratoshenes sieve = new SieveOfEratoshenes();
        Arrays.fill(array, true);
        for (int i = 2; i < array.length; i++) {
            if (!sieve.isPrime(i)){
                Arrays.fill(array,false);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SieveOfEratoshenes sieve = new SieveOfEratoshenes();
        if (sieve.isPrime(11)){
            System.out.println("is prime number");}
        else{
            System.out.println("is not a prime number");
        }
    }
}

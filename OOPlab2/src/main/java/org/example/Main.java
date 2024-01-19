package org.example;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //isPrime Tests
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(5));
        System.out.println(isPrime(6));
        System.out.println(isPrime(7));
        System.out.println(isPrime(8));
        System.out.println(isPrime(9));
        System.out.println(isPrime(10));

        //primeFactors Tests
        System.out.println(primeFactors(1));
        System.out.println(primeFactors(2));
        System.out.println(primeFactors(3));
        System.out.println(primeFactors(4));
        System.out.println(primeFactors(5));
        System.out.println(primeFactors(6));
        System.out.println(primeFactors(7));
        System.out.println(primeFactors(8));
        System.out.println(primeFactors(9));
        System.out.println(primeFactors(10));


    }

    //See if Prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    //Prime Factors
    public static ArrayList<Integer> primeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && n % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

}
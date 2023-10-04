package org.general;

import java.util.Scanner;

public class FactorialCalculator {

    // Write a program in java that calculates and prints the factorial of a given number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long factorial = calculateFactorial(number);
                System.out.println("Factorial of " + number + " is: " + factorial);
            }
        }
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}

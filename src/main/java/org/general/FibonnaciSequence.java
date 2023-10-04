package org.general;

public class FibonnaciSequence {
    // Write a program that prints the first 20 numbers in the Fibonacci sequence
    public static void main(String[] args) {
        int n = 20; // Change this value to generate more or fewer Fibonacci numbers

        long[] fibonacciNumbers = new long[n];

        /**
         * We create an array fibonacciNumbers to store the sequence.
         * We initialize the first two elements of the array with 0 and 1,
         * which are the starting numbers of the Fibonacci sequence.
         * */
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;
        /**
         * a for loop to calculate the subsequent Fibonacci numbers by adding the last two numbers in the sequence.
         * We start the loop from index 2 because the first two numbers are already initialized.
         * */
        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        System.out.println("Fibonacci Sequence (first " + n + " numbers):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumbers[i] + " ");
        }
    }
}

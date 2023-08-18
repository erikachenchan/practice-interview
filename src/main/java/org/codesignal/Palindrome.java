package org.codesignal;

public class Palindrome {

    static boolean isPalindrome(String inputString) {
        int left = 0;
        int right = inputString.length() - 1;

        while (left < right) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                return false; // Characters don't match
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String inputString = "a"; // aabaa = true, abac = false;, a= true;
        boolean result = isPalindrome(inputString);

        if (result) {
            System.out.println(inputString + " = true");
        } else {
            System.out.println(inputString + " = false");
        }
    }
}
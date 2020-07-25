package com.test;

public class Palindrome {

    public static void main(String[] args) {
        String palindrome = "abcbwa";
        System.out.println(palindrome + ": " + testPalindrome(palindrome));
    }

    public static boolean testPalindrome(String palindrome) {
        for (int i = 0 ; i <= palindrome.length() / 2; ++i) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1)){
                return false;
            }
        }

        return true;
    }
}

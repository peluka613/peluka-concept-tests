package com.test;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCarsInSubStringExample {
    public static void main(String[] args) {
        String input = "abcabcbb";
        String bestSubstring = "";
        int start = 0;

        for (int i = 1; i < input.length(); ++i){
            String substring = input.substring(start, i);
            if (testRepeated(substring)){
                ++start;
            } else if(substring.length() > bestSubstring.length()) {
                bestSubstring = substring;
            }
        }

        System.out.println(bestSubstring.length());

    }
    public static boolean testRepeated (String input){
        Map repeated = new HashMap();
        for (int i = 0; i < input.length(); ++i){
            repeated.put(input.charAt(i), input.charAt(i));
        }

        return repeated.size() < input.length();
    }
}

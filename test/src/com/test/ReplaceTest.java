package com.test;

import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;

public class ReplaceTest {


    public static void main(String[] args) {

        String Arguments = "%26a_InvNoDBId%3D6001003%26a_InvNoId%3D1000%26aCurrentUserId%3Dx216345";
        String argument = Arguments != null ?
                Arguments.replaceFirst("%26", "?").replaceAll("%26", "&") : null;

        System.out.println(argument);
    }

    public void test(int a){}
    public void test(long a){}
}


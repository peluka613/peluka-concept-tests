package com.test.codility.L002_arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] A = {5, -1000};
        int[] B = solution(A, 9);
        String joinedString = Arrays.stream(B)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ","[","]"));

        System.out.println(joinedString);
    }

    public static int[] solution(int[] A, int K) {
        if(K < 1 || A.length == 0 || (K != 1 && (K % A.length) == 0)) return A;

        int[] B = new int[A.length];

        int times = K % A.length;
        for(int i = 0; i < times; ++i){
            B[0] = A[A.length - 1];
            for(int j = 0; j < A.length-1; ++j){
                B[j+1] = A[j];
            }
            A = B.clone();
        }

        return B;
    }
}

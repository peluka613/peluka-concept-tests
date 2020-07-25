package com.test.codility.L002_arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        /*
        List<Integer> B = Arrays.stream(A).boxed().collect(Collectors.toList());
        return B.stream().filter(i -> Collections.frequency(B, i) % 2 == 1).findFirst().orElse(0);
         */

        Map<Integer, Integer> map = new HashMap();
        for (int s : A) {
            if (map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        for ( Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 == 1) return e.getKey();
        }

        return 0;

    }
}

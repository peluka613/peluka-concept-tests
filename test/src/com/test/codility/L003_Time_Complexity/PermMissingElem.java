package com.test.codility.L003_Time_Complexity;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class PermMissingElem {
    public static void main(String[] args) {

        //*****************************************
        int max = Integer.MAX_VALUE;
        System.out.println(max);

        int n = 500_000;
        int sumN = (n * (n + 1)) / 2;
        System.out.println(sumN);

        System.out.println(max - sumN);

        //*****************************************
        System.out.println("//*****************************************");
        int sumA = IntStream.range(0, n+1).sum();
        System.out.println(sumA);
        System.out.println(sumN - sumA);
        System.out.println("//*****************************************");
        //*****************************************
        int[] A = {};
        System.out.println(solution(A));

        A = new int[]{1};
        System.out.println(solution(A));

        A = new int[]{2};
        System.out.println(solution(A));

        A = new int[]{2, 3, 1, 5};
        System.out.println(solution(A));

        A = new int[]{2, 3, 6, 5, 4, 9, 8, 7};
        System.out.println(solution(A));

        A = new int[]{2, 3, 1, 5, 4, 6, 8, 7};
        System.out.println(solution(A));

        A = new int[]{2, 3, 1, 5, 4, 9, 8, 7};
        System.out.println(solution(A));
    }

    public static int solution(int[] A){

        if (A.length == 0) return 1;

        /*

        for (int i = 0; i < ordered.size(); i++) {
            if (ordered.get(i) != (i + 1)) return i + 1;
        }
         */

        /*
        List<Integer> ordered = Arrays.stream(A).sorted().mapToObj(Integer::new).collect(Collectors.toList());
        //System.out.print(ordered + ": ");
        return IntStream.range(0, A.length)
            .filter(i -> ordered.get(i) != (i + 1)).map(i -> ++i).findFirst().orElse(A.length + 1);

         */

        /*
        List<Integer> ordered = Arrays.stream(A).mapToObj(Integer::new).collect(Collectors.toList());
        List<Integer> nums = IntStream.range(1, A.length + 2).mapToObj(Integer::new).collect(Collectors.toList());
        nums.removeAll(ordered);
        return nums.get(0);
         */

        int n = A.length + 1;
        BigInteger sumA = BigInteger.valueOf(0);
        for (int item : A) sumA = sumA.add(BigInteger.valueOf(item));
        BigInteger sumN = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n+1)).divide(BigInteger.valueOf(2));
        return sumN.subtract(sumA).intValue();

    }
}

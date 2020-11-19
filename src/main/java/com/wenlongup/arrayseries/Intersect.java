package com.wenlongup.arrayseries;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class Intersect {
    public static void main(String args[]) {
//        wuxu();
        youxu();
    }

    private static void wuxu() {
        int numArray1[] = {4, 9, 5};
        int numArray2[] = {9, 4, 9, 8, 4};

        Set<Integer> set = new HashSet();

        for (int num2 : numArray2) {
            for (int num1 : numArray1) {
                if (num1 == num2) {
                    set.add(num1);
                }
            }
        }

        System.out.println(set);
    }

    private static void youxu() {
        int numArray1[] = {4, 9, 5, 6, 7, 3, 43, 23, 12, 45, 54};
        int numArray2[] = {9, 4, 3, 8, 6, 56, 7, 34, 54, 54, 54, 34, 43, 22, 21, 34, 56, 89, 76};

        Arrays.sort(numArray1);
        Arrays.sort(numArray2);

        Set<Integer> set = new HashSet();

//        int len = numArray1.length > numArray2.length ? numArray2.length : numArray1.length;

        for (int i = 0, j = 0; i < numArray1.length && j < numArray2.length; ) {
            if (numArray1[i] == numArray2[j]) {
                set.add(numArray1[i]);
                i++;
                j++;
            } else if (numArray1[i] < numArray2[j]) {
                i++;
            } else if (numArray1[i] > numArray2[j]) {
                j++;
            }
        }

        System.out.println(set);
    }
}

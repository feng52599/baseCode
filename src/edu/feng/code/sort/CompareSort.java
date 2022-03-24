package edu.feng.code.sort;

import StdLib.In;

import static edu.feng.code.utils.SortUtils.*;

/**
 * @program: baseCode
 * @description: TODO
 * @author: feng
 * @create: 2022-03-24 20:16
 * @version: 1.0
 */
public class CompareSort {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 0, 12, 32, 18, 28, 21, 17, 35};
        sortCompare(a);
        try {
            assert isSorted(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        show(a);
    }

    private static void sortCompare(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length - 1; j ++) {
                if (a[j] < a[min]) {
                    swap(a, min, j);
                }
            }
        }
    }


}
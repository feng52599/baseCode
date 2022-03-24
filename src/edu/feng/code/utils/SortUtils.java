package edu.feng.code.utils;

import StdLib.StdOut;

/**
 * @program: baseCode
 * @description: TODO
 * @author: feng
 * @create: 2022-03-24 20:26
 * @version: 1.0
 */
public class SortUtils {
    public static void show(Comparable[] a) {
        // 单行打印
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {
        // 测试数组元素是否有序
        return true;
    }
}
package edu.feng.code.sort;

import StdLib.In;

import static edu.feng.code.utils.SortUtils.isSorted;
import static edu.feng.code.utils.SortUtils.show;

/**
 * @program: baseCode
 * @description: TODO
 * @author: feng
 * @create: 2022-03-24 20:16
 * @version: 1.0
 */
public class CompareSort {
    public static void main(String[] args) {
        String[] a = new In("tiny.txt").readAllStrings();
        sort(a);
        try {
            assert isSorted(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        show(a);
    }


}
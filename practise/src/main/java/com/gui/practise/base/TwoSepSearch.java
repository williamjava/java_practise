package com.gui.practise.base;

import java.util.Arrays;

public class TwoSepSearch {

    /**
     * 二分查找
     */
    public static void main(String[] args) {
        int[] a = new int[]{3, 11, 34, 56, 72, 88, 90, 110};
        int oneTarget = 72;
        int twoTarget = 50;
        int oneResult = search(a, oneTarget, true);
        int twoResult = search(a, twoTarget, true);
        System.out.println("要查找的元素" + oneTarget + "在数组中的下标为：" + oneResult);
        System.out.println("要查找的元素" + twoTarget + "在数组中的下标为：" + twoResult
                + (twoResult == -1 ? "，该元素在数组中不存在" : ""));

        System.out.println("如果是一个乱序的数组呢？我们要先排序再进行查找！");
        int[] b = new int[]{3, 72, 88, 11, 34, 56, 90, 110};
        oneResult = search(b, oneTarget, false);
        System.out.println("第二次查找，要查找的元素" + oneTarget + "在数组中的下标为：" + oneResult);
    }

    public static int search(int[] a, int target, boolean sorted) {
        // 进行二分法查找的前提是数字已经排好序的，并且升序。
        if (!sorted) {
            Arrays.sort(a);
        }
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = a[mid];

            if (midVal < target) {
                low = mid + 1;
            }else if (midVal > target) {
                high = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
} 
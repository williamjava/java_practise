package com.gui.practise.base;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 找出一个数组中，出现次数最多的元素
 */
public class MaxCountInArrayTest {
    public static void main(String[] args) {
        Integer [] nums = {1,2,3,2,2,2,5,4,2};
        Map<Integer, Integer> sourceMap = new HashMap<Integer, Integer>();
        for (int i =0;i<nums.length;i++) {
            if (sourceMap.get(nums[i]) == null) {
                sourceMap.put(nums[i], 1);
            } else {
                int temp = sourceMap.get(nums[i]);
                sourceMap.put(nums[i], temp +1);
            }
        }

        int maxCount = Collections.max(sourceMap.values());
        for (Map.Entry<Integer, Integer> entry: sourceMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.println(entry.getKey());
            }
        }
    }
}

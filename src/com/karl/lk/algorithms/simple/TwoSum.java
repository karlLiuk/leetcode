package com.karl.lk.algorithms.simple;

import java.util.HashMap;

/**
 * @Description 两数之和.
 * @Date 2021/6/3
 * @Author lk
 */
public class TwoSum {
    /**
     * 暴力解法
     **/
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 哈希表解法
     **/
    public int[] twoSumHash(int[] nums, int target) {
        final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        final TwoSum twoSum = new TwoSum();
        final int[] result = twoSum.twoSumHash(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}

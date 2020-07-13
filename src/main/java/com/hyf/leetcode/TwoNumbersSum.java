package com.hyf.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author : heyanfeng
 * create at:  2020-07-12  20:25
 * @description: 两数之和
 */
public class TwoNumbersSum {
    public static void main(String[] args) {
        TwoNumbersSum twoNumbersSum = new TwoNumbersSum();
        int[] result = twoNumbersSum.twoSum2(new int[]{-3,4,3,90}, 0);
        Arrays.stream(result).forEach(System.out::println);

    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    flag = true;
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                return new int[] {map.get(temp), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

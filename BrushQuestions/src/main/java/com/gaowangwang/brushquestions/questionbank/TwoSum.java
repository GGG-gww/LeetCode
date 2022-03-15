package com.gaowangwang.brushquestions.questionbank;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两数之和
 * @date 2022-3-15
 * @author 无敌小南瓜
 */
public class TwoSum {

    /**
     * solution1:暴力枚举
     * @param nums 集合数组
     * @param target 目标和
     * @return 目标下标数组
     */
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                //target - nums[i] == nums[j]
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * solution1:Hash
     * @param nums 集合数组
     * @param target 目标和
     * @return 目标下标数组
     */
    public static int[] twoSum2(int[] nums, int target){
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>(nums.length * 2);
        for (int i = 0; i < nums.length; i++) {
            if (integerIntegerHashMap.containsKey(target-nums[i])){
                return new int[]{integerIntegerHashMap.get(target-nums[i]),i};
            }
            integerIntegerHashMap.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] ints = twoSum2(new int[]{2, 7, 12, 15}, 9);
        System.out.println("ints = " + Arrays.toString(ints));
    }
}

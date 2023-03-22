package com.example.demo.algr.common;

import com.alibaba.fastjson.JSON;

import java.util.Objects;

/**
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 4, 2};
        insertSort(nums);
        System.out.println(JSON.toJSONString(nums));

    }


    private static void insertSort(int[] nums) {
        if (Objects.isNull(nums) || nums.length == 0) {
            return;
        }

        for (int i = 1; i < nums.length; i++) {
            int tmp = nums[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (nums[j] > tmp) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j + 1] = tmp;
        }

    }


}

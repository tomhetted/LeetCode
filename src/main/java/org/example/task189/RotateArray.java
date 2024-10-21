package org.example.task189;

import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] result = new int[n];
        int count = 0;

        for (int i = n - k; i < n; i++) {
            result[count] = nums[i];
            count++;
        }

        for (int i = 0; i < n - k; i++) {
            result[count] = nums[i];
            count++;
        }

        System.arraycopy(result, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
    }

}

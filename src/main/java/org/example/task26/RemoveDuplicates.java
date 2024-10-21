package org.example.task26;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        Integer k = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }

    public static void main(String[] args) {
       int nums[] = {0,0,1,1,1,2,2,3,3,4};
       System.out.println(removeDuplicates(nums));
    }
}

package org.example.task27;


public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(removeElement(nums, 3));
    }

    public static int removeElement(int[] nums, int val) {
        Integer k = 0;

        for (Integer unit : nums) {
            if (!unit.equals(val)) {
                nums[k] = unit;
                k++;
            }
        }
        return k;
    }
}

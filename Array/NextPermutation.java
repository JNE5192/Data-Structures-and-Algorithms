/*
https://leetcode.com/problems/next-permutation/
*/

class Solution {
    public void nextPermutation(int[] nums) {
        // find right subarray to be changed
        int start = 0;

        if (isSortedDesc(nums))
            reverse(nums, start);

        else {
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    start = i;
                    break;
                }
            }

            for (int j = nums.length - 1; j > start; j--) {
                if (nums[j] > nums[start]) {
                    swap(nums, start, j);
                    break;
                }
            }
            reverse(nums, start + 1);
        }

    }

    public void reverse(int[] nums, int index) {
        int i = index;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public void swap(int[] nums, int first, int second) {
        int tmp = nums[first];
        nums[first] = nums[second];
        nums[second] = tmp;
    }

    public Boolean isSortedDesc(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                return false;
        }
        return true;
    }
}
/*
https://leetcode.com/problems/monotonic-array/
*/

class Solution {
    public boolean isMonotonic(int[] nums) {
        for(int i = 0; i <= nums.length-2; i++) {
            if(nums.length == 1)
                return true;

            //Decreasing order
            if (nums[0] >= nums[nums.length -1]) {
                if(nums[i] < nums[i+1])
                     return false;
            }
            //Increasing order
            if (nums[0] <= nums[nums.length -1]) {
                if(nums[i] > nums[i+1])
                     return false;
            }       
        }
    return true;   
    }
}
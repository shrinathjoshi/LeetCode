/**
 * 
 * @author Shrinath Joshi
 * date:- 8th December 2019 
 *
 * https://leetcode.com/problems/move-zeroes/
 *
 * Time Complexity :- O(n)
 * Space Complexity :- O(1)
 */


class Solution {
    public void moveZeroes(int[] nums) {
        
        int slow = 0,fast=0;
        
        while( fast <= nums.length-1 && slow <= nums.length-1)
        {
            if(nums[fast] !=0)
            {
                    int temp = nums[fast];
                    nums[fast] = nums[slow];
                    nums[slow] = temp;
                    slow++;
                    fast = slow;
            }
            else fast++;
        }
    }
}
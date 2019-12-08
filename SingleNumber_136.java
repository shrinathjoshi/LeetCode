/**
 * 
 * @author Shrinath Joshi
 * date:- 8th December 2019 
 *
 * https://leetcode.com/problems/single-number/
 *
 * Time Complexity :- O(n)
 * Space Complexity :- O(1)
 */

class Solution {
    public int singleNumber(int[] nums) {
        
        int result=0;
        for(int i=0;i<nums.length ;i++)
            result=result^(nums[i]);
        
        return result;
    }
}
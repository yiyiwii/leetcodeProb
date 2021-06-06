//Given a non-empty array of integers nums, every element appears twice except f
//or one. Find that single one. 
//
// You must implement a solution with a linear runtime complexity and use only c
//onstant extra space. 
//
// 
// Example 1: 
// Input: nums = [2,2,1]
//Output: 1
// Example 2: 
// Input: nums = [4,1,2,1,2]
//Output: 4
// Example 3: 
// Input: nums = [1]
//Output: 1
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 3 * 104 
// -3 * 104 <= nums[i] <= 3 * 104 
// Each element in the array appears twice except for one element which appears 
//only once. 
// 
// Related Topics Hash Table Bit Manipulation 
// 👍 6262 👎 204


package com.yiyiwii.leetcode.editor.en;
public class SingleNumber {
    public static void main(String[] args) {
        Solution solution = new SingleNumber().new Solution();
        int[] nums = new int[]{4,1,2,1,2};

        solution.singleNumber(nums);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
            System.out.println(res);
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
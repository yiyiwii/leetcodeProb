//There are N students in a class. Some of them are friends, while some are not.
// Their friendship is transitive in nature. For example, if A is a direct friend 
//of B, and B is a direct friend of C, then A is an indirect friend of C. And we d
//efined a friend circle is a group of students who are direct or indirect friends
//. 
//
// Given a N*N matrix M representing the friend relationship between students in
// the class. If M[i][j] = 1, then the ith and jth students are direct friends wit
//h each other, otherwise not. And you have to output the total number of friend c
//ircles among all the students. 
//
// Example 1: 
//
// 
//Input: 
//[[1,1,0],
// [1,1,0],
// [0,0,1]]
//Output: 2
//Explanation:The 0th and 1st students are direct friends, so they are in a frie
//nd circle. 
//The 2nd student himself is in a friend circle. So return 2.
// 
//
// 
//
// Example 2: 
//
// 
//Input: 
//[[1,1,0],
// [1,1,1],
// [0,1,1]]
//Output: 1
//Explanation:The 0th and 1st students are direct friends, the 1st and 2nd stude
//nts are direct friends, 
//so the 0th and 2nd students are indirect friends. All of them are in the same 
//friend circle, so return 1.
//
// 
//
// 
// Constraints: 
//
// 
// 1 <= N <= 200 
// M[i][i] == 1 
// M[i][j] == M[j][i] 
// 
// Related Topics Depth-first Search Union Find 
// 👍 2415 👎 166


package com.yiyiwii.leetcode.editor.en;
public class FriendCircles {
    public static void main(String[] args) {
        Solution solution = new FriendCircles().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findCircleNum(int[][] M) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
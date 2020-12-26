//Given an m x n matrix of non-negative integers representing the height of each
// unit cell in a continent, the "Pacific ocean" touches the left and top edges of
// the matrix and the "Atlantic ocean" touches the right and bottom edges. 
//
// Water can only flow in four directions (up, down, left, or right) from a cell
// to another one with height equal or lower. 
//
// Find the list of grid coordinates where water can flow to both the Pacific an
//d Atlantic ocean. 
//
// Note: 
//
// 
// The order of returned grid coordinates does not matter. 
// Both m and n are less than 150. 
// 
//
// 
//
// Example: 
//
// 
//Given the following 5x5 matrix:
//
//  Pacific ~   ~   ~   ~   ~ 
//       ~  1   2   2   3  (5) *
//       ~  3   2   3  (4) (4) *
//       ~  2   4  (5)  3   1  *
//       ~ (6) (7)  1   4   5  *
//       ~ (5)  1   1   2   4  *
//          *   *   *   *   * Atlantic
//
//Return:
//
//[[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with paren
//theses in above matrix).
// 
//
// 
// Related Topics Depth-first Search Breadth-first Search 
// 👍 1586 👎 347


package com.yiyiwii.leetcode.editor.en;

import java.util.List;

public class PacificAtlanticWaterFlow {
    public static void main(String[] args) {
        Solution solution = new PacificAtlanticWaterFlow().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
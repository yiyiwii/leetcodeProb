//A message containing letters from A-Z is being encoded to numbers using the fo
//llowing mapping: 
//
// 
//'A' -> 1
//'B' -> 2
//...
//'Z' -> 26
// 
//
// Given a non-empty string containing only digits, determine the total number o
//f ways to decode it. 
//
// The answer is guaranteed to fit in a 32-bit integer. 
//
// 
// Example 1: 
//
// 
//Input: s = "12"
//Output: 2
//Explanation: It could be decoded as "AB" (1 2) or "L" (12).
// 
//
// Example 2: 
//
// 
//Input: s = "226"
//Output: 3
//Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6)
//.
// 
//
// Example 3: 
//
// 
//Input: s = "0"
//Output: 0
//Explanation: There is no character that is mapped to a number starting with '0
//'. We cannot ignore a zero when we face it while decoding. So, each '0' should b
//e part of "10" --> 'J' or "20" --> 'T'.
// 
//
// Example 4: 
//
// 
//Input: s = "1"
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 100 
// s contains only digits and may contain leading zero(s). 
// 
// Related Topics String Dynamic Programming 
// 👍 3190 👎 3149

  
package com.yiyiwii.leetcode.editor.en;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DecodeWays {
    public static void main(String[] args) {
        Solution solution = new DecodeWays().new Solution();
        System.out.println(solution.LETTERS);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private final List<String> LETTERS = IntStream.range(1, 27)
            .mapToObj(Integer::toString).collect(Collectors.toList());
    public int numDecodings(String s) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return dfs(0, memo, s);
    }
    private int dfs(int i, int[] memo, String s) {
        if (i == s.length()) return 1;
        if (memo[i] == -1) {
            int ways = 0;
            String remaining = s.substring(i);
            for (String pref : LETTERS) {
                if (remaining.startsWith(pref)) {
                    ways += dfs(i + pref.length(), memo, s);
                }
            }
            memo[i] = ways;
        }
        return memo[i];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
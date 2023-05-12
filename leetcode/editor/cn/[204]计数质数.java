//给定整数 n ，返回 所有小于非负整数 n 的质数的数量 。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 10
//输出：4
//解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
// 
//
// 示例 2： 
//
// 
//输入：n = 0
//输出：0
// 
//
// 示例 3： 
//
// 
//输入：n = 1
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= n <= 5 * 10⁶ 
// 
//
// Related Topics 数组 数学 枚举 数论 👍 1060 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        int ans = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                ans++;
                if ((long) i * i < n) {
                    //2*2=4之后就会把大于4的2的倍数都置为false以此类推，就是这么个原理
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
        }
        return ans;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

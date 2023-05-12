//给你一个整数数组 nums ，返回数组中最大数和最小数的 最大公约数 。 
//
// 两个数的 最大公约数 是能够被两个数整除的最大正整数。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [2,5,6,9,10]
//输出：2
//解释：
//nums 中最小的数是 2
//nums 中最大的数是 10
//2 和 10 的最大公约数是 2
// 
//
// 示例 2： 
//
// 输入：nums = [7,5,6,8,3]
//输出：1
//解释：
//nums 中最小的数是 3
//nums 中最大的数是 8
//3 和 8 的最大公约数是 1
// 
//
// 示例 3： 
//
// 输入：nums = [3,3]
//输出：3
//解释：
//nums 中最小的数是 3
//nums 中最大的数是 3
//3 和 3 的最大公约数是 3
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 1000 
// 1 <= nums[i] <= 1000 
// 
//
// Related Topics 数组 数学 数论 👍 37 👎 0

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0], max = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return gcd(min, max);
    }
    //辗转相除法

    /**
     *
     * max%min = a .....b
     * min%b = c .....d
     */
    public int gcd(int a, int b) {
        //等于0的话，就等于前一个余数
        return b == 0 ? a : gcd(b, a % b);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

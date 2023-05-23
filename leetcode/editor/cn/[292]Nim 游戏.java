//你和你的朋友，两个人一起玩 Nim 游戏： 
//
// 
// 桌子上有一堆石头。 
// 你们轮流进行自己的回合， 你作为先手 。 
// 每一回合，轮到的人拿掉 1 - 3 块石头。 
// 拿掉最后一块石头的人就是获胜者。 
// 
//
// 假设你们每一步都是最优解。请编写一个函数，来判断你是否可以在给定石头数量为 n 的情况下赢得游戏。如果可以赢，返回 true；否则，返回 false 。 
//
//
// 
//
// 示例 1： 
//
// 
//输入：n = 4
//输出：false 
//解释：以下是可能的结果:
//1. 移除1颗石头。你的朋友移走了3块石头，包括最后一块。你的朋友赢了。
//2. 移除2个石子。你的朋友移走2块石头，包括最后一块。你的朋友赢了。
//3.你移走3颗石子。你的朋友移走了最后一块石头。你的朋友赢了。
//在所有结果中，你的朋友是赢家。
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：n = 2
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 2³¹ - 1 
// 
//
// Related Topics 脑筋急转弯 数学 博弈 👍 677 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // 1. 规律总结
    //如果拿到4的倍数，那么就一定会输，因为不管你拿几个，对方都可以拿到4的倍数，直到最后一轮，轮到你拿，就会输了。
    //如果不是4的倍数，那么就一定会赢，因为你可以拿到4的倍数，让对方面对4的倍数的情况。
    //所以，我们只需要看n是不是4的倍数就行了。
//    public boolean canWinNim(int n) {
//        return n % 4 != 0;
//    }

        // 2. 递归
        // 递归的思路是，如果我能赢，那么我肯定要让对方输，也就是让对方面对4的倍数，所以我要拿到4的倍数，让对方面对非4的倍数，这样就能赢了。
        // 递归的终止条件就是，当我面对4的倍数的时候，我就输了。
        // 递归的代码如下：
//        public boolean canWinNim(int n) {
//            if (n <= 0) {
//                throw new IllegalArgumentException();
//            }
//            return canWin(n);
//        }
//
//        private boolean canWin(int n) {
//            if (n <= 3) {
//                return true;
//            }
//            if (n % 4 == 0) {
//                return false;
//            }
//            return canWin(n - 1) || canWin(n - 2) || canWin(n - 3);
//        }

        // 3. 动态规划
        // 递归的思路是，如果我能赢，那么我肯定要让对方输，也就是让对方面对4的倍数，所以我要拿到4的倍数，让对方面对非4的倍数，这样就能赢了。
        // 递归的终止条件就是，当我面对4的倍数的时候，我就输了。
        // 递归的代码如下：


}
//leetcode submit region end(Prohibit modification and deletion)

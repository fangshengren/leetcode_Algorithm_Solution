//给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。 
//
// 整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3ˣ 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 27
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：n = 0
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：n = 9
//输出：true
// 
//
// 示例 4： 
//
// 
//输入：n = 45
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= n <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能不使用循环或者递归来完成本题吗？ 
//
// Related Topics 递归 数学 👍 295 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    //我的写法
//    public boolean isPowerOfThree(int n) {
//        if(n == 0){
//            return false;
//        }
//        else if (n == 1) {
//             return true;
//        }
//        else{
//            return isPowerOfThree(n/3)&&n%3==0;
//        }
//    }
    //最快运行时间，最少内存消耗的写法
    //因为方法递归会额外消耗内存，所以推荐使用循环
//    public boolean isPowerOfThree(int n) {
//        if (n < 1) {
//            return false;
//        }
//
//        while (n % 3 == 0) {
//            n /= 3;
//        }
//
//        return n == 1;
//    }
    //方法三：基准转换  不够快
    //因为题目要求不能使用循环或者递归，所以我们可以使用基准转换的方法
    //将数字转换为以3为基准的数字，如果是3的幂次方，那么转换后的数字一定是以1开头，后面全是0
    //所以我们只需要判断转换后的数字是否以1开头，后面全是0即可
//    public boolean isPowerOfThree(int n) {
//        return Integer.toString(n, 3).matches("^10*$");
//    }
    //方法四：整数限制
    //因为题目要求不能使用循环或者递归，所以我们可以使用整数限制的方法
    //因为int整数范围内最大的3的幂次方是3^19=1162261467
    //所以我们只需要判断n是否是3^19的约数即可
//    public boolean isPowerOfThree(int n) {
//        return n > 0 && 1162261467 % n == 0;
//    }
    //方法五：对数运算
    //因为题目要求不能使用循环或者递归，所以我们可以使用对数运算的方法
    //因为3^x=n，所以x=log3(n)=log10(n)/log10(3)
    //所以我们只需要判断log10(n)/log10(3)是否为整数即可
    //但是由于计算机的精度问题，我们不能直接用log10(n)/log10(3)来判断，而是用log10(n)/log10(3)的差值是否小于10^-12来判断
    //因为log10(n)/log10(3)的差值小于10^-12，那么就可以认为log10(n)/log10(3)是整数
    //所以我们只需要判断log10(n)/log10(3)的差值是否小于10^-12即可
//    public boolean isPowerOfThree(int n) {
//        return (Math.log10(n) / Math.log10(3) + 10e-15) % 1 <= 2 * 10e-15;
//    }
    //方法六：换底公式
    //因为题目要求不能使用循环或者递归，所以我们可以使用换底公式的方法
    //因为3^x=n，所以x=log3(n)=log10(n)/log10(3)
    //所以我们只需要判断log10(n)/log10(3)是否为整数即可
    //但是由于计算机的精度问题，我们不能直接用log10(n)/log10(3)来判断，而是用log10(n)/log10(3)的差值是否小于10^-12来判断
    //因为log10(n)/log10(3)的差值小于10^-12，那么就可以认为log10(n)/log10(3)是整数
    //所以我们只需要判断log10(n)/log10(3)的差值是否小于10^-12即可
//    public boolean isPowerOfThree(int n) {
//        return (Math.log(n) / Math.log(3) + 10e-15) % 1 <= 2 * 10e-15;
//    }
    //穷举法
    //因为题目要求不能使用循环或者递归，所以我们可以使用穷举法的方法
    //因为int整数范围内最大的3的幂次方是3^19=1162261467
    //所以我们只需要判断n是否是3^0、3^1、3^2、3^3、3^4、3^5、3^6、3^7、3^8、3^9、3^10、3^11、3^12、3^13、3^14、3^15、3^16、3^17、3^18、3^19中的一个即可
    //所以我们只需要判断n是否是3^0、3^1、3^2、3^3、3^4、3^5、3^6、3^7、3^8、3^9、3^10、3^11、3^12、3^13、3^14、3^15、3^16、3^17、3^18、3^19中的一个即可
    public boolean isPowerOfThree(int n) {
        return n == 1 || n == 3 || n == 9 || n == 27 || n == 81 || n == 243 || n == 729 || n == 2187 || n == 6561 || n == 19683 || n == 59049 || n == 177147 || n == 531441 || n == 1594323 || n == 4782969 || n == 14348907 || n == 43046721 || n == 129140163 || n == 387420489 || n == 1162261467;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

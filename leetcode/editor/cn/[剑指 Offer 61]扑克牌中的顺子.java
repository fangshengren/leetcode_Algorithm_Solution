//从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，
//可以看成任意数字。A 不能视为 14。 
//
// 
//
// 示例 1: 
//
// 
//输入: [1,2,3,4,5]
//输出: True 
//
// 
//
// 示例 2: 
//
// 
//输入: [0,0,1,2,5]
//输出: True 
//
// 
//
// 限制： 
//
// 数组长度为 5 
//
// 数组的数取值为 [0, 13] . 
//
// Related Topics 数组 排序 👍 328 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    //我的解答
//    public boolean isStraight(int[] nums) {
//        Arrays.sort(nums);
//        int countZero = 0;
//        int NotSeries = 0;
//        for(int i=0;i<nums.length-1;i++){
//            if(nums[i]==0){
//                countZero++;
//            } else if((nums[i+1]-nums[i])==0) {
//                return false;
//            } else{
//                NotSeries += (nums[i+1]-nums[i])-1;
//            }
//        }
//        if (countZero>=NotSeries){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
    //最快消耗内存最小解答
    public boolean isStraight(int[] nums) {
        int[] bucket = new int[14];
        int min = 14;
        int max = 0;
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            bucket[num]++;
            if (bucket[num] > 1) {
                return false;
            }
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min < 5;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

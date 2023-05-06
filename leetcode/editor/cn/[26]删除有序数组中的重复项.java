package leetcode.editor.cn;
//给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致
//。然后返回 nums 中唯一元素的个数。 
//
// 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过： 
//
// 
// 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不
//重要。 
// 返回 k 。 
// 
//
// 判题标准: 
//
// 系统会用下面的代码来测试你的题解: 
//
// 
//int[] nums = [...]; // 输入数组
//int[] expectedNums = [...]; // 长度正确的期望答案
//
//int k = removeDuplicates(nums); // 调用
//
//assert k == expectedNums.length;
//for (int i = 0; i < k; i++) {
//    assert nums[i] == expectedNums[i];
//} 
//
// 如果所有断言都通过，那么您的题解将被 通过。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,2]
//输出：2, nums = [1,2,_]
//解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,0,1,1,1,2,2,3,3,4]
//输出：5, nums = [0,1,2,3,4]
//解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 3 * 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums 已按 升序 排列 
// 
//
// Related Topics 数组 双指针 👍 3151 👎 0


import java.sql.Array;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    //我的想法

    /**
     *难得耶
     * > 2023/05/06 10:50:57
     * 解答成功:
     * 	执行耗时:0 ms,击败了100.00% 的Java用户
     * 	内存消耗:42.6 MB,击败了98.01% 的Java用户
     * 	但是好像是意外之后都是
     *
     * 	> 2023/05/06 11:00:12
     * 解答成功:
     * 	执行耗时:1 ms,击败了29.78% 的Java用户
     * 	内存消耗:43.1 MB,击败了62.21% 的Java用户
     */
    public int myRemoveDuplicates(int[] nums) {
        int count=1;
        int storeNum;
        int storeIndex=1;
        for(int i=0;i<nums.length-1;i++){
            storeNum = nums[i];
            if(storeNum == nums[nums.length-1]){
                return count;
            }
            for(int j=storeIndex;j<nums.length;j++){
                if(nums[j]!=storeNum){
                    nums[i+1]=nums[j];
                    storeIndex=j;
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    //高级代码双指针
    //只需要一个查是否有新元素的指帧循环一次就够了，指针和存的前一位作对比，不相等存的位置就存入新元素
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int x=0;
        int y=1;
        for(int i=y;i<nums.length;i++){
            if(nums[x]!=nums[i]){
                if(i-x>1){
                    nums[x+1]=nums[i];
                }
                x++;
            }
        }
        return x+1;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

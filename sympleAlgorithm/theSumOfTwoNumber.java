package sympleAlgorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class theSumOfTwoNumber{
    //这是我的垃圾解法
    public static int[] twoSum(int[] nums, int target) {
        int x [] = new int [2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    x[0]=i;
                    x[1]=j;
                    return x;
                }
            }
        }
        return x;
    }
    //高阶代码
    //空间换时间的思路，用哈希表
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>(nums.length-1);
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[0];
    }
    public static void main(String[]args){
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum2(new int[]{2, 7, 11, 15}, 9)));
    }
}



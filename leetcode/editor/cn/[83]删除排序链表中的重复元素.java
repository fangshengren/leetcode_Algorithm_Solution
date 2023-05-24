//给定一个已排序的链表的头
// head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,1,2]
//输出：[1,2]
// 
//
// 示例 2： 
// 
// 
//输入：head = [1,1,2,3,3]
//输出：[1,2,3]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目在范围 [0, 300] 内 
// -100 <= Node.val <= 100 
// 题目数据保证链表已经按升序 排列 
// 
//
// Related Topics 链表 👍 991 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    //我的垃圾解法，因为题目肯定是升序，其实就没必要用set了
//    public ListNode deleteDuplicates(ListNode head) {
//        if(head==null||head.next==null){
//            return head;
//        }
//        ListNode dummyNode=new ListNode(0);
//        dummyNode.next=head;
//        ListNode temp=dummyNode;
//        Set<Integer> value= new HashSet<Integer>();
//        while(temp.next!=null){
//            if(!value.contains(temp.next.val)){
//                value.add(temp.next.val);
//                temp=temp.next;
//            }else{
//                temp.next=temp.next.next;
//            }
//        }
//        return dummyNode.next;
//    }
    //最好解法
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        while(temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

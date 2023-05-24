//给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。 
//
// k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5], k = 2
//输出：[2,1,4,3,5]
// 
//
// 示例 2： 
//
// 
//
// 
//输入：head = [1,2,3,4,5], k = 3
//输出：[3,2,1,4,5]
// 
//
// 
//提示：
//
// 
// 链表中的节点数目为 n 
// 1 <= k <= n <= 5000 
// 0 <= Node.val <= 1000 
// 
//
// 
//
// 进阶：你可以设计一个只用 O(1) 额外内存空间的算法解决此问题吗？ 
//
// 
// 
//
// Related Topics 递归 链表 👍 2033 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.Stack;

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
    public ListNode reverseKGroup(ListNode head, int k) {
        //处理异常情况
        if(k==1||head==null||head.next==null){
            return head;
        }
        //表头加一个空节点，便于处理
        ListNode dummyNode = new ListNode(0);
        dummyNode.next=head;
        ListNode pre=dummyNode;
        ListNode end=dummyNode;
        while (end.next!=null){
            for(int i =0;i<k&&end!=null;i++){
                end=end.next;
            }
            if(end==null){break;}
            //到这时，pre.next是需要倒转的开始，end是需要倒转的结束

            //未反转前开始的节点的引用，反转后会变成最后一个，需要保存一下
            ListNode start=pre.next;
            //存储后面的引用，防止丢失
            ListNode finish=end.next;
            //断表，用于反转
            end.next=null;
            //反转
            pre.next=reverse(start);
            //把反转后面的内容接进去
            start.next = finish;
            //像dummyNode一样，pre和end在接下来需要从遍历处的前一格开始
            pre = start;
            end = pre;
        }

        return dummyNode.next;
    }

    //用于反转的方法
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next=head;
        head.next = null;
        return newHead;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

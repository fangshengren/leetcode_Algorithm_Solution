//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
//
// Related Topics 链表 双指针 👍 2538 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.HashMap;
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
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        HashMap<Integer,ListNode> set = new HashMap<Integer,ListNode>();
//        ListNode temp = head;
//        int key=1;
//        set.put(key,temp);
//        while (temp!=null){
//            key++;
//            temp=temp.next;
//            set.put(key,temp);
//        }
//        System.out.println(key);
//        //最后Null也放进去了
//        //最后key的值就是个数+1
//        //删除时如果被删的元素有前一个，那么前一个的next等于被删的next
//        //如果没有前一个，那么返回被删的next
//        //被删除的key应该是key-n
//        if(set.containsKey(key-n-1)){
//            set.get(key-n-1).next=set.get(key-n).next;
//        }else{
//            return set.get(key-n).next;
//        }
//        return head;
//    }
//
    //双指针的方法！高级！
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

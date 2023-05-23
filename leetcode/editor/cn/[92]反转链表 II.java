//给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链
//表节点，返回 反转后的链表 。
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5], left = 2, right = 4
//输出：[1,4,3,2,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [5], left = 1, right = 1
//输出：[5]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目为 n 
// 1 <= n <= 500 
// -500 <= Node.val <= 500 
// 1 <= left <= right <= n 
// 
//
// 
//
// 进阶： 你可以使用一趟扫描完成反转吗？ 
//
// Related Topics 链表 👍 1566 👎 0


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
    //我自己想到的估计是用Set来做
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right || head == null)
            return head;
        int count = 1;
        ListNode start = head;
        ListNode end = null;
        ListNode start0 = head;
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            if (count < left)
                start = head;
            else {
                if (count <= right)
                    stack.push(head);
                else {
                    end = head;
                    break;
                }
            }

            head = head.next;
            count++;
        }
        ListNode start1 = stack.peek();
        ListNode cur = stack.pop();
        while (!stack.isEmpty()) {
            cur.next = stack.peek();
            cur = stack.pop();
        }
        cur.next = end;
        if (left == 1)
            return start1;
        start.next = start1;
        return start0;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

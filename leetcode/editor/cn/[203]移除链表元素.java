//给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,6,3,4,5,6], val = 6
//输出：[1,2,3,4,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [], val = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [7,7,7,7], val = 7
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 列表中的节点数目在范围 [0, 10⁴] 内 
// 1 <= Node.val <= 50 
// 0 <= val <= 50 
// 
//
// Related Topics 递归 链表 👍 1248 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
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
//    public ListNode removeElements(ListNode head, int val) {
//        //思路使用递归
//        if(head==null){
//            //到最后一个点时返回最后一个点
//            return null;
//        }
//
//        if(head.val==val){
//            //如果当前需要删除，把当前的跳过
//            head=removeElements(head.next,val);
//        }
//        else{
//            //如果当前不需要删除，继续检查下一项
//            head.next=removeElements(head.next,val);
//        }
//
//        return head;
//
//    }

        public ListNode removeElements(ListNode head, int val) {
        ListNode initialNode = new ListNode(0);
        initialNode.next=head;
        ListNode temp=initialNode;
        while (temp.next!=null){
            //下一个值等于val意味着要删除
            if(temp.next.val==val){
                //把next给越过了
                temp.next=temp.next.next;
            }else {
                //不能单独拿出来写的原因是因为检查的都是Next如果出现2个连续需要删除的值，就会出现问题
                temp = temp.next;
            }
        }

        return initialNode.next;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

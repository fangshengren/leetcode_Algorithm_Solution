//给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5], k = 2
//输出：[4,5,1,2,3]
// 
//
// 示例 2： 
// 
// 
//输入：head = [0,1,2], k = 4
//输出：[2,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 500] 内 
// -100 <= Node.val <= 100 
// 0 <= k <= 2 * 10⁹ 
// 
//
// Related Topics 链表 双指针 👍 925 👎 0


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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        int length=getLength(head);
        int realK=k%length;
        if(length==1||realK==0){
            return head;
        }
        //思路,最后一个的next变成第一个
        //得先弄最后一个，先弄倒2个的话最后一个回丢失，或者把最后一个存起来
        //倒数第二个的next变成null
        //以下的用法是每次先倒二next变null，然后将最后一个存起来
        for(int i=0;i<realK;i++){
            head=rotateRight(length,head);
        }
        return head;
    }

    public ListNode rotateRight(int length,ListNode head) {
        //存引用
        ListNode temp = head;
        //声明最后一个
        ListNode last = null;
        //跨越length-2次到倒数第二个上
        for (int i=1;i<length-1;i++){
            temp=temp.next;
        }
        //把最后一个存起来
        last=temp.next;
        //最后一个变成null
        temp.next=null;
        //存的最后一个放在首部
        last.next=head;

        return last;
    }

    public int getLength(ListNode head){
        int length=0;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

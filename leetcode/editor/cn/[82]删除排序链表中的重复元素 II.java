//给定一个已排序的链表的头 head ， 删除原始链表中所有重复数字的节点，只留下不同的数字 。返回 已排序的链表 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,3,4,4,5]
//输出：[1,2,5]
// 
//
// 示例 2： 
// 
// 
//输入：head = [1,1,1,2,3]
//输出：[2,3]
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
// Related Topics 链表 双指针 👍 1123 👎 0


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
    //思路，先加入空头结点便于遍历
    //然后看next和next.next是否相同
    //相同的话要设置循环直到不同，相同就删除节点
    //跳出循环时，next节点也删除
    //要实现这些就要保证next.next不等于null，并且在删除时的特殊情况要注意用break跳出循环

    public ListNode deleteDuplicates(ListNode head) {
        //处理特殊情况
        if(head==null||head.next==null){
            return head;
        }
        //加入头节点，便于遍历操作，当不用头节点时，当中间出现重复数字时就很难删除
        ListNode dummyNode = new ListNode(0);
        dummyNode.next=head;
        ListNode temp = dummyNode;
        while (temp.next.next!=null){
            if(temp.next.val==temp.next.next.val){
                while ((temp.next.val==temp.next.next.val)){
                    temp.next.next=temp.next.next.next;
                    //防止当最后一个为Null时，回到while出现报错情况
                    if(temp.next.next==null){break;}
                }
                temp.next=temp.next.next;
                //后面全相同全被删时，就可以直接返回了，同时防止while报错
                if(temp.next==null){return dummyNode.next;}
            }else{
                temp=temp.next;
            }
        }
        return dummyNode.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

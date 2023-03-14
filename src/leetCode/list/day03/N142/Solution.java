package leetCode.list.day03.N142;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/5 14:52
 */

public class Solution {

    public static void main(String[] args) {

        ListNode l4 = new ListNode(4, null);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode l5 = new ListNode(5, l3);
        l4.next = l5;
        ListNode head = l1;
//
////       while(head!=null){
////           System.out.println(head.val);
////           head=head.next;
////       }

    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null) {                   //空表返回null
            return head;
        }
        ListNode fast = head, slow = head;       //设置快慢指针
        while (fast != null && fast.next != null) {     //不存在后继为null，继续循环
            fast = fast.next.next;                //快指针是慢指针的两倍
            slow = slow.next;

            if (fast == slow) {                     //相遇后
                fast = head;                      //将快指针重置为表头
                while (fast != slow) {             //快慢指针速度一致
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;                    //返回fast
            }
        }
        return null;                       //不存在环 返回null
    }
}

    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

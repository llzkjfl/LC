package leetCode.list.day03.N24;

/**
 * @Description: 第24题
 * @Author: llz
 * @Date: 2023/3/4 21:13
 */

public class Solution {
    public static void main(String[] args) {
        ListNode l4 = new ListNode(4,null);
        ListNode l3 = new ListNode(3,l4);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);
        ListNode head = l1;

        ListNode newHead = swapPairs(head);
        ListNode p = newHead;
        while(p!=null){
            System.out.println(p.val);
            p = p.next;
        }

    }
    public static ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }

        ListNode newHead = new ListNode();
        newHead.next = head;

        ListNode p = newHead;
        ListNode pr = newHead.next;
        ListNode prr = pr.next;

        do{
            pr.next = prr.next;
            prr.next=pr;
            p.next = prr;
            p = pr;
            pr = p.next;
            if (pr==null||pr.next==null){
                break;
            }
            prr = pr.next;
        }while(pr.next!=null);

        return newHead.next;
    }
}





class ListNode {
    int val;
    ListNode next;
    public ListNode(){ }
    public ListNode(int val) { this.val = val; }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

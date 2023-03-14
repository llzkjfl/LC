package leetCode.list.day03.N19;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/4 22:25
 */

public class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        //空表或只有一个
        if (head==null){
            return head;
        }else if(head.next==null&&n==1){
            head = null;
            return head;
        }

        //两个及以上
        ListNode newHead = new ListNode(-1,head);//虚拟表头

        ListNode p = newHead;
        ListNode pr = newHead;

        for(int i=0;i<n;i++){    //=
            pr = pr.next;
        }

        while ( pr!=null&&pr.next != null) {
            pr = pr.next;
            p = p.next;
        }


       p.next = p.next.next;
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode l4 = new ListNode(4, null);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode head = l1;

        ListNode newHead = removeNthFromEnd(head,3);
        ListNode p = newHead;
        while(p!=null){
            System.out.println(p.val);
            p = p.next;
        }


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

    public ListNode(int val,ListNode next) {
        this.val = val;
        this.next = next;
    }
}

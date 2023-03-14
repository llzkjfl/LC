package leetCode.list.day03.N0207;

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
        ListNode headA = l1;
        ListNode l5 = new ListNode(5, l3);
        ListNode headB = l5;

//       while(headB!=null){
//           System.out.println(headB.val);
//           headB=headB.next;
//       }




        ListNode finalHead = getIntersectionNode(headA, headB);
        System.out.println(finalHead.val);


    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        while(pA!=pB){
            pA = (pA==null)?headB:pA.next;
            pB = (pA==null)?headA:pB.next;
        }

        return pA;
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

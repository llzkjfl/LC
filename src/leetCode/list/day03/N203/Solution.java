package leetCode.list.day03.N203;

import org.junit.Test;

/**
 * @Description:
 * @Author: llz
 * @Date: 2023/3/2 22:37
 */
//链表测试
public class Solution {
   @Test
    public void delectLink(){
       //头插法
       ListNode1 l5 = new ListNode1(24,null);
       ListNode1 l4 = new ListNode1(23,l5);
       ListNode1 l3 = new ListNode1(5,l4);
       ListNode1 l2 = new ListNode1(2,l3);
       ListNode1 l1 = new ListNode1(1,l2);
       ListNode1 head = new ListNode1(-1,l1);
       int  val = 5;
       ListNode1 p = head;
       while(p.next!=null){
           if(p.next.val==val){
               p.next=p.next.next;
           }
           p=p.next;
       }

    p=head.next;
    while(p!=null){
        System.out.println(p.val);
        p=p.next;
    }

   }


}

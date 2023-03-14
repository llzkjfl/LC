package leetCode.list.day03.N707.doubleList;


/**
 * @Description: 707题设计链表
 * @Author: llz
 * @Date: 2023/3/3 9:14
 */

class ListNode {
    int val;
    ListNode next,prev;
    public ListNode(){ }
    public ListNode(int val) { this.val = val; }
}

public  class MyLinkedList {

    int length;
    ListNode head = new ListNode();
    ListNode tail = new ListNode();

    public MyLinkedList() {
        this.length =0;
        head.next=tail;
        tail.prev=head;
    }


    public int get(int index) {
        if(index<0||index>=length){
            return  -1;
        }
        ListNode p = head;
        for(int i=0;i<=index;i++){
            p = p.next;
        }
        return p.val;
    }


    public void addAtIndex(int index, int val) {
        if(index<0){
            index=0;
        }if(index>length){
            return;
        }
        ListNode p = head;
        for(int i=0;i<index;i++){
            p=p.next;
        }
        ListNode newNode = new ListNode(val);

        newNode.next = p.next;
        p.next.prev = newNode;
        p.next=newNode;
        newNode.prev=p;


    }
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(length,val);
    }

    public void deleteAtIndex(int index) {
        if(index>=0&&index<length){
            ListNode p = head;
            for(int i=0;i<index;i++){
                    p=p.next;
            }
            p.next=p.next.next;
            p.next.prev=p;

        }
    }
}

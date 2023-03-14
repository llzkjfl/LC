package leetCode.list.day03.N707.singleList;


/**
 * @Description: 707题设计链表
 * @Author: llz
 * @Date: 2023/3/3 9:14
 */
class ListNode {           //单链表节点
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }      //构造方法
}

public  class MyLinkedList {
    ListNode head  = new ListNode(-1) ;  //创建虚拟头节点，next默认为null
    int length;                          //链表长度

    public MyLinkedList( ) {length=0;}  //构造方法 初始长度为0

    public int get(int index) {
        if(index>=length||index<0){      //索引不合法
            return -1;
        }
        ListNode p =head;
        for(int i=0;i<=index;i++){      //从0开始 找index+1次
            p=p.next;                   //当前元素
        }
        return p.val;
    }

    public void addAtIndex(int index, int val) { //指定位置添加
        if(index>length){                   //大于链表个数不添加
            return ;
        }
        if(index<0){                    //index<0 添加到第一个
            index=0;
        }
        ListNode p = head;
        for(int i=0;i<index;i++){       //找index次
            p=p.next;                   //当前元素的前一个
        }
        ListNode l = new ListNode(val); //添加
        l.next = p.next;
        p.next=  l;
        length++;

    }

    public void addAtHead(int val) {
        addAtIndex(0,val);         //首部也就是index<=0
    }

    public void addAtTail(int val) {
        addAtIndex(length,val);    //尾部也就是index=length
    }

    public void deleteAtIndex(int index) {
        if(index>=0&&index<length){     //不能是length因为index从零开始
            ListNode p = head;
            for(int i=0;i<index;i++){   //移动index次
                p=p.next;               //找到需要删除元素的前一个元素
            }
            p.next = p.next.next;
            length--;
        }
    }
}

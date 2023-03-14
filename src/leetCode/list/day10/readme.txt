栈与队列
一:队列Queue----FIFO
    A: 输入输出分为
        普通队列 与 双端队列
       线程分为
        阻塞队列 与 非阻塞队列
       Queue接口继承Collection实现类有LinkedList,Deque,

    B: Queue接口继承Collection向下接口有Deque,阻塞队列，非阻塞队列
       Queue为单队列接口--继承Collection--有实现类LinkedList
       Deque为双端队列接口--继承Queue-- 有实现类 LinkedList


二:栈Stack-----FILO
    A: 栈继承于List下的vector实现类 但vector由底层由数组实现 所以一般用Deque实现
package com.hyf.java_arithmetic.queue;

import com.hyf.java_arithmetic.util.CommonUtil;
import lombok.Data;
import lombok.ToString;


/**
 * @author : heyanfeng
 * create at:  2019-12-14  15:19
 * @description: 自定义队列实现
 */
@Data
@ToString
public class Queue {
    private int[] array;
    private int front;
    private int rear;

    public Queue(int capacity) {
        this.array = new int[capacity];
    }

    /**
     * description：队列进队
     * create by heyanfeng at 2019-12-15 19:58
     *
     * @param element 输入的元素
     */
    public void enQueue(int element) {
        int size = (rear + 1) % array.length;
        CommonUtil.throwException(size == front, "队列已经满了");
        array[rear] = element;
        rear = size;
    }

    /**
    * description: 出队
    * create by heyanfeng at 2019-12-15 20:15
    */
    public int deQueue() {
        CommonUtil.throwException(rear == front, "队列已空");
        int deQueueElement = array[front];
        front = (front + 1) % array.length;
        return deQueueElement;
    }

    /**
     * description: 输出队列
     * create by heyanfeng at 2019-12-14 15:25
     */
    public void output() {
        for (int i = front; i != rear; i = (i + 1) % array.length) {
            System.out.println(array[i]);
        }
    }
}

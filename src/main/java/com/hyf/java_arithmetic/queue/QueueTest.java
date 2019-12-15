package com.hyf.java_arithmetic.queue;

/**
 * @author : heyanfeng
 * create at:  2019-12-15  20:04
 * @description:
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue(2);
        queue.enQueue(2);
        System.out.println(queue.toString());
        System.out.println(queue.deQueue());
    }
}

package com.hyf.java_arithmetic.link;

/**
 * @author : heyanfeng
 * create at:  2019-12-14  12:32
 * @description: 测试链表
 */
public class LinkTest {

    public static void main(String[] args) {
        Link link = new Link();
        link.insert(3, 0);
        link.insert(5, 1);
        link.insert(6, 2);
        link.insert(4, 1);

        link.del(1);
        link.output();

    }
}

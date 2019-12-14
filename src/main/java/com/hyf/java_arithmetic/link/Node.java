package com.hyf.java_arithmetic.link;

import lombok.Data;
import lombok.ToString;

/**
 * @author : heyanfeng
 * create at:  2019-12-14  12:09
 * @description:
 */
@Data
@ToString
public class Node {
    /**
     * 当前节点的数据
     */
    int data;
    /**
     *  下一个节点的数据
     */
    Node next;

    public Node(int data) {
        this.data = data;
    }
    public  Node(){};
}

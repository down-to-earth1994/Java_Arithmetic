package com.hyf.java_arithmetic.link;

import com.hyf.java_arithmetic.util.CommonUtil;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.var;

/**
 * @author : heyanfeng
 * create at:  2019-12-14  12:11
 * @description: 实现链表
 */
@Data
@ToString
public class Link {
    /**
     * 头节点
     */
    private Node head;
    /**
     * 尾节点
     */
    private Node last;
    /**
     * 链表的实际长度
     */
    private int size;


    public void insert(int data, int index) {
        CommonUtil.throwException(index < 0 || index > size, "超出链表节点范围");
        Node node = new Node(data);

        if (size == 0) {
            //插入头部
            head = node;
            last = node;
        } else if (size == index) {
            //插入尾部
            last.next = node;
            last = node;
        } else {
            //插入中间
            Node prevNode = getCurIndexNode(index - 1);
            Node nextNode = prevNode.next;
            prevNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public Node del(int index) {
        CommonUtil.throwException(index < 0 || index > size, "超出链表节点范围");
        Node removedNode;
        if (index == 0) {
            //删除头节点
            removedNode = head;
            head = head.next;
        } else if (index == size - 1) {
            //删除尾节点
            removedNode = last;
            last = getCurIndexNode(index - 1);
            last.next = null;
        } else {
            //删除中间节点
            Node prveNode = getCurIndexNode(index - 1);
            Node nextNode = prveNode.next.next;
            removedNode = prveNode.next;
            prveNode.next = nextNode;
        }
        size--;
        return removedNode;
    }

    /**
     * description: 输出link
     * create by heyanfeng at 2019-12-14 12:59
     */
    public void output() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    /**
     * description: 查找指定位置的节点；
     * create by heyanfeng at 2019-12-14 12:29
     *
     * @param index 是获取上一个节点的next; eg 当获取第5个位置；index 传4
     * @return Node eg: 4.next;
     */
    public Node getCurIndexNode(int index) {
        CommonUtil.throwException(index < 0 || index > size, "超出链表节点范围");
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

}

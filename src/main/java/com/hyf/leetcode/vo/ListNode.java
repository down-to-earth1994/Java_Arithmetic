package com.hyf.leetcode.vo;

import lombok.Data;

/**
 * @author : heyanfeng
 * create at:  2020-07-12  22:03
 * @description:
 */
@Data
public class ListNode {
    private int val;
    private ListNode next;
    public ListNode(int x) { val = x; }
}

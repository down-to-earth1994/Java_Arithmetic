package com.hyf.leetcode;

import com.hyf.leetcode.vo.ListNode;

import java.util.Arrays;

/**
 * @author : heyanfeng
 * create at:  2020-07-12  22:00
 * @description: 两数之和
 */
public class SumOfTwoNumber {
    public static void main(String[] args) {
        createListNode(new int[] {1,2,3});
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        return null;
    }

    public static ListNode createListNode(int [] numbers){
        arrayReverse(numbers);
        ListNode result = new ListNode(numbers[0]);
        for (int i = 1; i < numbers.length ; i++) {
            if(i == 1){
                result.setNext(new ListNode(numbers[i]));
            }
            if(i == numbers.length - 1){
                new ListNode(numbers[i]);
            }

        }
        return result;
    }

    public static void arrayReverse(int [] numbers){
        int temp  =  0;
        int  length = numbers.length;
        for (int i = 0; i < length / 2 ; i++) {
            temp = numbers[i];
            numbers[i] =  numbers[length - i -1];
            numbers[length - i -1] = temp;
        }
    }
}

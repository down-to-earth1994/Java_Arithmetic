package com.hyf.java_arithmetic.tree.heap;

import java.util.Arrays;

/**
 * @author : heyanfeng
 * create at:  2019-12-21  10:38
 * @description: 二叉堆操作
 */
public class BinaryHeap {

    /**
     * description: 构建二叉堆
     * create by heyanfeng at 2019-12-21 10:42
     *
     * @param array 待构建的堆
     */
    public static void buildHeap(int[] array) {
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            downAdjust(array, i, array.length);
        }
    }

    /**
     * description: 上浮 调整
     * create by heyanfeng at 2019-12-21 10:43
     *
     * @param array 待调整的堆
     */
    public static void upAdjust(int[] array) {
        int childIndex = array.length - 1;
        int parentIndex = (childIndex - 1) / 2;
        int temp = array[childIndex];
        while (childIndex > 0 && temp < array[parentIndex]) {
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (parentIndex - 1) / 2;
        }
        array[childIndex] = temp;
    }


    /**
     * description: 下沉操作
     * create by heyanfeng at 2019-12-21 11:07
     *
     * @param array       待调整的堆
     * @param parentIndex 要下沉的父节点
     * @param length      堆的有效大小
     * @return
     */
    public static void downAdjust(int[] array, int parentIndex, int length) {
        //temp 保存父节点的值，用于最后的赋值
        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length) {
            //如果有右孩子，且右孩子小于左边的孩子，则定位到右孩子
            if (childIndex + 1 < length && array[childIndex + 1] < array[childIndex]) {
                childIndex++;
            }
            //如果父节点小于任何一个孩子的值，则直接跳出
            if (temp <= array[childIndex]) {
                break;
            }
            //无序真正的交换
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        array[parentIndex] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        upAdjust(array);
        System.out.println(Arrays.toString(array));
    }
}

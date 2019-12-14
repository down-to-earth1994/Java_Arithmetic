package com.hyf.java_arithmetic.array;

import com.hyf.java_arithmetic.util.CommonUtil;

import java.util.Arrays;

/**
 * @Author heyanfeng
 * @Contact
 * @Description 数组结构  crud 以及实现数组扩容
 * @Date Created in 2019/12/12
 */
public class ArrayTest {
    public static void main(String[] args) {
//        int[] array = new int[]{3, 1, 2, 5, 4, 9, 7, 2};
        //测试打印数组
        /*  System.out.println(arrayPrint(array));*/

        //测试生成数组
        /*    System.out.println(arrayPrint(creatArray(100)));*/

        //测试指定位置插入数据 如果指定索引大于数组长度，对当前数组进行2倍扩容
         /*int[] array = addOrUpdate(new int[2], 2, 1);
        System.out.println(arrayPrint(array));*/

        //测试指定位置修改数据
       /* int[] array = addOrUpdate(new int[2], 1, 1);
        System.out.println(arrayPrint(addOrUpdate(array, 1, 3)));*/

        //测试数组扩容
        /*int[] array = new int[10];
        System.out.println(arrayPrint(arrayCapacity(array)));*/

        //测试数组删除
        /*int[] ints = arrayDel(new int[]{10,4}, 1);
        System.out.println(arrayPrint(ints));*/


    }

    /**
     * description: 删除数组
     * create by heyanfeng at 2019-12-14 00:04
     *
     * @param array 要被删除的数组
     * @param index 要被删除数组中的索引
     * @return int[] 返回一个新的数组
     */
    public static int[] arrayDel(int[] array, int index) {
        CommonUtil.throwException(index < 0 || index >= array.length, "超出数组实际的元素范围");
        for (int i = index; i < array.length - 1; i++) {
            array[index] = array[index + 1];
        }
        return Arrays.copyOf(array, array.length - 1);
    }

    /**
     * description: 数组扩容 以当前数组2倍进行扩容
     * create by heyanfeng at 2019-12-13 13:40
     *
     * @param array
     * @return int[]
     */
    public static int[] arrayCapacity(int[] array) {
        return Arrays.copyOf(array, array.length * 2);
    }


    /**
     * description: 指定位置插入数据
     * create by heyanfeng at 2019-12-13 13:11
     *
     * @param array 数组
     * @param index 下标
     * @param value 下标值
     * @return int[]
     */
    public static int[] addOrUpdate(int[] array, int index, int value) {
        CommonUtil.throwException(index < 0, "超出数组实际的元素范围");
        if (index > array.length - 1) {
            array =  arrayCapacity(array);
        }
        array[index] = value;
        return array;
    }

    /**
     * 打印数组
     *
     * @param array
     * @return String
     */
    public static String arrayPrint(int[] array) {
        if (array.length == 1) {
            return "[" + array[0] + "]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                sb.append(array[i]);
            } else {
                sb.append(array[i] + ",");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    /**
     * 生成指定长度的数组
     *
     * @param length
     * @return
     */
    public static int[] creatArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length - 1; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }
}

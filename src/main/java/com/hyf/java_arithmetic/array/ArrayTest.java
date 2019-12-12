package com.hyf.java_arithmetic.array;

/**
 * @Author heyanfeng
 * @Contact
 * @Description 数组结构  crud 以及实现数组扩容
 * @Date Created in 2019/12/12
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 2, 5, 4, 9, 7, 2};
       /* String result = arrayPrint(array);
        System.out.println(result);*/
        System.out.println(arrayPrint(creatArray(100)));
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
        for (int i = 0; i <array.length ; i++) {
            sb.append(array[i] + ",");
            if (i == array.length-1) {
                sb.append(array[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }


    /**
     * 生成指定长度的数组
     * @param length
     * @return
     */
    public  static  int[] creatArray(int length){
        int[] array = new int[length];
        for(int i = 0;i<length-1;i++){
            array[i] = (int)(Math.random()*10);
        }
        return array;
    }
}

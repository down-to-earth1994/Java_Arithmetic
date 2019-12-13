package com.hyf.java_arithmetic.util;

/**
 * @author : heyanfeng
 * create at:  2019-12-13  13:13
 * @description:
 */
public class CommonUtil {
    /**
    * description: 当条为true 的时候触发手动抛出参数
    * create by heyanfeng at 2019-12-13 13:15
    * @param condition 触发条件
    * @param message  消息
    */
    public static void throwException(Boolean condition ,String message){
        if(condition){
            throw  new IllegalArgumentException(message);
        }
    }
}

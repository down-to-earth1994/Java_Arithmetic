package com.hyf.tool.guava;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * @author : heyanfeng
 * create at:  2020-06-07  19:26
 * @description: Lists 工具类的使用
 * Lists 工具类的常用方式
 * 反转 / 拆分
 */
@Slf4j
@Component
public class ListsTool<T> {

    /**
    * description: 拆分 list
     * list = [1,2,3,4,5,6,7];size = 3; => [[1,2,3],[4,5,6],[7]]
    * create by heyanfeng at 2020-06-07 20:58
    * @return List<T>
    * @param list 拆分的list
    * @param size 拆分的大小
    */
    public List<T> partition(List<T> list , int size){
        return (List<T>) Lists.partition(list,size);
    }

    /**
    * description: 将list 反转
    * create by heyanfeng at 2020-06-07 21:01
    * @return  List
    * @param list
    */
    public List<T> reverse(List<T> list){
        return Lists.reverse(list);
    }
}

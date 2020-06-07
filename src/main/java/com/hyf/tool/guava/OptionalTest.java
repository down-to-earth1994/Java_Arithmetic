package com.hyf.tool.guava;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author : heyanfeng
 * create at:  2020-06-07  22:22
 * @description:
 */
@Component
public class OptionalTest {
    /**
    * description: 创建一个为null 的option
    * create by heyanfeng at 2020-06-07 22:24
    */
    public Optional empty(){
       return Optional.empty();
    }
    /**
    * description: 创建一个非nullOption
    * create by heyanfeng at 2020-06-07 22:25
    */
    public Optional of(Object o){
        return Optional.of(o);
    }
    /**
    * description: 可以任意类型的Option
    * create by heyanfeng at 2020-06-07 22:25
    */
    public Optional ofNullable(Object o){
        return Optional.ofNullable(o);
    }

    /**
    * description: 判断option 是否引用缺失
    * create by heyanfeng at 2020-06-07 22:26
    */
    public Boolean isPresent( Optional optional){
       return optional.isPresent();
    }

    /**
    * description: 当引用存在时 执行
    * create by heyanfeng at 2020-06-07 22:28
    */
    public void ifPresent(Optional optional, Consumer consumer){
        optional.ifPresent(consumer);
    }

    /**
    * description: 当引用缺失时候执行的方法
    * create by heyanfeng at 2020-06-07 22:29
    */
//     optional.orElse("");
//        optional.orElseGet(null);
//        optional.orElseThrow(() -> {
//        throw new IllegalArgumentException();
//    });
    /**
    * description: 当使用集合时候如何用Optional 做处理
    * create by heyanfeng at 2020-06-07 22:34
    */
    public void stream(List<String> list){
        Optional.ofNullable(list)
                .map(List::stream)
                .orElseGet(Stream::empty)
                .forEach(System.out::println);
    }

}

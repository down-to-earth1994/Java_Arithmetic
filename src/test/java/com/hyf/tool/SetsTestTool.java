package com.hyf.tool;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Sets;
import com.hyf.Start;
import com.hyf.tool.guava.SetsTool;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Start.class)
@Slf4j
public class SetsTestTool {
    @Autowired
    private SetsTool setsTool;

    private static  final Set set1 = Sets.newHashSet(1,2,3);
    private static  final Set set2 = Sets.newHashSet(4,5,6);

    @Test
    public void  union(){
        Set union = setsTool.union(set1, set2);
        log.info("两个集合的并集:{}",union.toString());
    }

    @Test
    public void intersection(){
        Set intersection = setsTool.intersection(set1, set2);
        log.info("两个集合的交集:{}",intersection.toString());
    }

    @Test
    public  void difference(){
        Set difference = setsTool.intersection(set1, set2);
        log.info("两个集合的差集:{}",difference.toString());
    }
    @Test
    public void powerSet(){
        Set powerSet = setsTool.powerSet(set1);
        log.info("Set集合拆分:{}",JSON.toJSONString(powerSet));
    }

    @Test
    public void cartesianProduct(){
        Set cartesianProduct = setsTool.cartesianProduct(set1, set2);
        log.info("笛卡尔集合:{}",JSON.toJSONString(cartesianProduct));
    }



}

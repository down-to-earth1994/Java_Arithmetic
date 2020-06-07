package com.hyf.tool;

import com.hyf.tool.guava.ListsTool;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
class ListsToolTest {
    @Autowired
    private ListsTool listsTool;
    public static  final List<Integer> list  =Lists.newArrayList(1,2,3,4,5,6,7);
    @Test
    void partition() {
        List partition = listsTool.partition(list,3);
        log.info("partition后的list:{}",partition);
    }

    @Test
    void reverse() {
        List reverse = listsTool.reverse(list);
        log.info("reverse后的list:{}",reverse);
    }
}

package com.hyf.tool.guava;

import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @author : heyanfeng
 * create at:  2020-06-07  19:26
 * @description: Sets 工具类的使用
 * Sets 工具类的常用方法
 * 并集 / 交集 / 差集 / 分解 集合中的所有子集  / 求两个集合的笛卡尔积
 */
@Slf4j
@Component
public class SetsTool {
    /**
     * description: 合并来两个set
     * create by heyanfeng at 2020-06-07 19:33
     *
     * @param set1
     * @param set2
     * @return Set
     */
    public Set union(Set set1, Set set2) {
        return Sets.union(set1, set2);
    }

    /**
     * description: 取两个Set的 差集
     * create by heyanfeng at 2020-06-07 19:41
     *
     * @param set1
     * @param set2
     * @return Set
     */
    public Set intersection(Set set1, Set set2) {
        return Sets.intersection(set1, set2);
    }

    /**
     * description:  两个集合的差集  元素属于A 而且不属于 B 此时属于差集的一个结果
     * create by heyanfeng at 2020-06-07 19:52
     *
     * @param set1
     * @param set2
     * @return Set
     */
    public Set difference(Set set1, Set set2) {
        //相对差集 属于 A 而且不属于 B 或者 属于 B 不属于 A
        /* Sets.SetView setView = Sets.symmetricDifference(set1, set2);*/
        return Sets.difference(set1, set2);
    }

    /**
     * description: 将一个Set 集合拆分
     * eg: [1,2] => [[],[1],[1,2],[2],[2,1]]
     * create by heyanfeng at 2020-06-07 19:57
     *
     * @param set1
     * @return Set<Set>
     */
    public Set powerSet(Set set1) {
        return Sets.powerSet(set1);
    }

    /**
    * description: 取两个集合的笛卡尔集
     * eg set1=[1] , set2 =[2] ==> [1,2]
    * create by heyanfeng at 2020-06-07 20:45
    * @return Set
    * @param set1
    * @param set2
    */
    public Set cartesianProduct(Set set1, Set set2) {
        return Sets.cartesianProduct(set1, set2);
    }
}

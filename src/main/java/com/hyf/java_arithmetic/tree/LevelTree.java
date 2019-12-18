package com.hyf.java_arithmetic.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author heyanfeng
 * @Contact
 * @Description
 * @Date Created in 2019/12/18
 */
public class LevelTree {
    public static void levelTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println(node.data);
            if(node.leftChild != null){
                queue.offer(node.leftChild);
            }
            if(node.rightChild != null){
                queue.offer(node.rightChild);
            }
        }
    }
}

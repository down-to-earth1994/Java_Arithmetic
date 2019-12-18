package com.hyf.java_arithmetic.tree;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Author heyanfeng
 * @Contact
 * @Description
 * @Date Created in 2019/12/16
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<Integer>(
                Arrays.asList(new Integer[]{3,2,9,null,null,10,null,null,8,null,4})
        );
        System.out.println("*****构建二叉树*****");
        TreeNode treeNode = TreeNode.createBinaryTree(inputList);
        System.out.println(treeNode);
        System.out.println("*****前序遍历*****");
        DepthTree.perOrderTraveral(treeNode);
        System.out.println("*****中序遍历*****");
        DepthTree.inOrderTraveral(treeNode);
        System.out.println("*****后序遍历*****");
        DepthTree.postOrderTraveral(treeNode);
        System.out.println("*****广度遍历*****");
        LevelTree.levelTree(treeNode);
    }

}

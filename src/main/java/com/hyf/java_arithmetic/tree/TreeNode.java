package com.hyf.java_arithmetic.tree;

import lombok.Data;
import lombok.ToString;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;

/**
 * @Author heyanfeng
 * @Contact
 * @Description
 * @Date Created in 2019/12/16
 */
@Data
@ToString
public class TreeNode {
    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }
    public TreeNode(){};

    /**
     *  构建二叉树
     * @param inputList
     * @return
     */
    public static TreeNode  createBinaryTree(LinkedList<Integer> inputList){
        TreeNode node = null;
        if(inputList == null  ||  inputList.isEmpty()){
            return null;
        }
        Integer data = inputList.removeFirst();
        if(data != null){
            node = new TreeNode(data);
            node.leftChild =  createBinaryTree(inputList);
            node.rightChild = createBinaryTree(inputList);
        }
        return node;
    }
}

package com.hyf.java_arithmetic.tree;

import java.util.Stack;

/**
 * @Author heyanfeng
 * @Contact
 * @Description 树的深度遍历
 * @Date Created in 2019/12/16
 */
public class DepthTree {

    /**
     * 二叉树的前序遍历
     *
     * @param node
     */
    public static void perOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        perOrderTraveral(node.leftChild);
        perOrderTraveral(node.rightChild);
    }

    /**
     * 二叉树的中序遍历
     *
     * @param node
     */
    public static void inOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraveral(node.leftChild);
        System.out.println(node.data);
        inOrderTraveral(node.rightChild);
    }

    /**
     * 后序遍历
     *
     * @param node
     */
    public static void postOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraveral(node.leftChild);
        postOrderTraveral(node.rightChild);
        System.out.println(node.data);

    }


    public static void perOrderTraveralWithStack(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode treeNode =  root;
        while (treeNode != null || !stack.isEmpty()){
            while (treeNode!=null){
                System.out.println(treeNode.data);
                stack.push(treeNode);
                treeNode = treeNode.leftChild;
            }
            //如果节点没有左孩子，则弹出栈顶节点，访问节点的右孩子
            if(!stack.isEmpty()){
                treeNode =  stack.pop();
                treeNode = treeNode.rightChild;
            }
        }
    }
}

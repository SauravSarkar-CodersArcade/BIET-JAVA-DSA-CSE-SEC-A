package com.biet.dsa.dataStructures.nonLinear.trees.interviewQuestions.height;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        // Initially the node has no children
        this.left = this.right = null;
    }
    public static int findHeight(TreeNode root){
        if (root == null){
            return 0; // Height of empty tree is 0
        }
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        // Construct the tree from top to bottom,
        // level by level
        // left to right
        // Level 0
        TreeNode root = new TreeNode(1);
        // Level 1
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        // Level 2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        // Level 3
        root.left.right.left = new TreeNode(9);
        root.right.right.left = new TreeNode(15);
        System.out.println("Height of the tree: " +
                findHeight(root));
    }
}

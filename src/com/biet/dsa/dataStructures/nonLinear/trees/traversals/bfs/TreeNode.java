package com.biet.dsa.dataStructures.nonLinear.trees.traversals.bfs;

import java.util.LinkedList;
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
    public static void bfsOrLevelOrderTraversal(TreeNode root){
        // If the tree is empty, we can't traverse
        if (root == null){
            return;
        }
        // You are pushing the nodes of the tree into a queue
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode temp = q.poll();
            System.out.print(temp.data + " ");
            // Go to the left subtree if it exists
            if (temp.left != null){
                q.add(temp.left);
            }
            // Go to the right subtree if it exists
            if(temp.right != null){
                q.add(temp.right);
            }
        }
        System.out.println();
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
        System.out.println("Level Order Traversal or BFS: ");
        bfsOrLevelOrderTraversal(root);
    }
}

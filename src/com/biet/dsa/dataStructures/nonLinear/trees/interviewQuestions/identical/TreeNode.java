package com.biet.dsa.dataStructures.nonLinear.trees.interviewQuestions.identical;
public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        // Initially the node has no children
        this.left = this.right = null;
    }
   public static boolean areIdentical(TreeNode t1, TreeNode t2){
        // Check if both are empty => true
       if(t1 == null && t2 == null) return true;
       // Check if any one is empty => false
       if(t1 == null || t2 == null) return false;
       // Check if node data are not matching => false
       if (t1.data != t2.data) return false;
       // Check recursively for both the left/right subtrees
       return areIdentical(t1.left, t2.left) &&
               areIdentical(t1.right, t2.right);
   }
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(4);
        System.out.println((areIdentical(root1,root2)) ?
                "Identical" : "Not Identical");
        System.out.println((areIdentical(root1,root3)) ?
                "Identical" : "Not Identical");
    }
}

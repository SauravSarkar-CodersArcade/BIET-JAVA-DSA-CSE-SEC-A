package com.biet.dsa.dataStructures.nonLinear.bst;
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class BinarySearchTree {
    public static void inOrder(TreeNode root){ // LRD
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    static TreeNode insert(TreeNode root, int key){
        // Case 1: if the tree is empty, the key will become the root
        if (root == null){
            return new TreeNode(key);
        }
        if (key < root.data){
            root.left = insert(root.left, key);
        }else if(key > root.data){
            root.right = insert(root.right, key);
        }
        return root;
    }
    static TreeNode search(TreeNode root, int key){
        // Case 1: Empty - return null or root
        // Case 2: If root data matches the key, return root
        if (root == null || root.data == key) return root;
        if (root.data < key){
            return search(root.right, key);
        }
        return search(root.left, key);
    }
    static TreeNode findMin(TreeNode root){
        TreeNode curr = root;
        while (curr != null && curr.left != null){
            curr = curr.left; // Extreme Left
        }
        return curr;
    }
    public static TreeNode delete(TreeNode root, int key){
        if (root == null) return root; // return null
        // Two Normal Cases
        if (key < root.data){
            root.left = delete(root.left, key);
        }else if(key > root.data){
            root.right = delete(root.right, key);
        }else{
            // Node with only one child
            // New root will be the non-null child
            if (root.left == null){
                TreeNode temp = root.right;
                root = null;
                return temp;
            }
            else if(root.right == null){
                TreeNode temp = root.left;
                root = null;
                return temp;
            }
            // If the node has both children
            // We find the inorder successor
            // The smallest node in the right subtree
            TreeNode temp = findMin(root.right);
            // replace the root.data by temp.data
            root.data = temp.data;
            // There are two duplicate values in the tree
            // Remove the extra node
            root.right = delete(root.right, temp.data);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = null; // Empty Tree
        root = insert(root, 50);
        inOrder(root);
        System.out.println();
        int[] arr = {60,20,30,10,58,100};
        for (int x : arr){
            root = insert(root, x);
        }
        inOrder(root);
        System.out.println();
        TreeNode res1 = search(root, 100);
        TreeNode res2 = search(root, 99);
        System.out.println((res1 == null) ? "Not Found" : "Found");
        System.out.println((res2 == null) ? "Not Found" : "Found");
        root = delete(root, 50);
        inOrder(root);
        System.out.println();
        System.out.println("New root: " + root.data);
    }
}

package com.biet.dsa.dataStructures.nonLinear.trees.interviewQuestions.lca;
class Node {
    char data;
    Node left;
    Node right;
    Node(char data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class LCAExample {
    static Node LCA(Node root, char n1, char n2){
        if (root == null) return null;
        if (root.data == n1 || root.data == n2) return root;
        Node left = LCA(root.left, n1, n2);
        Node right = LCA(root.right, n1, n2);
        if (left != null && right != null){
            return root;
        }
        return (left != null) ? left : right; // non-null child
    }
    public static void main(String[] args) {
        Node root = new Node('A');
        root.left = new Node('B');
        root.right = new Node('C');
        root.left.left = new Node('D');
        root.left.right = new Node('E');
        root.right.left = new Node('F');
        root.right.right = new Node('G');
        Node ans = LCA(root, 'D', 'E');
        System.out.println("LCA = " + ans.data);
    }
}

package com.biet.dsa.dataStructures.nonLinear.bst.sortedArrayToBalancedBST;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode() {}
    TreeNode(int val){
        this.val = val;
        this.left = this.right = null;
    }
}
class SortedArrayToBalancedBST {

}
class Solution {
    public TreeNode sortedArrayToBST(int[] nums){
        return sortedArrayToBST(nums, 0, nums.length-1);
    }
    private TreeNode sortedArrayToBST(int[] nums, int s,
                                      int e){
        if (s > e){
            return null;
        }
        int mid = s + (e-s) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, s, mid-1);
        root.right = sortedArrayToBST(nums, mid+1, e);
        return root;
    }
}

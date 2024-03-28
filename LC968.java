class Solution {
    int cam = 0;
    public int minCameraCover(TreeNode root) {
        if(camHelper(root) == 0){
            cam++;
        }
        return cam;
    }
    private int camHelper(TreeNode root){
        if(root == null) return 2;
        int left = camHelper(root.left);
        int right = camHelper(root.right);
        if(left == 0 || right == 0){
            cam++;
            return 1;
        }
        else if(left == 1 || right == 1) return 2;
        else return 0;
    }
}
//O(N), O(N)

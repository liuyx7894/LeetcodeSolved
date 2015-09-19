/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> array=new ArrayList<List<Integer>>();
        if(root==null){
            return array;
        }
        getListByNode(array, root, 0);
        
        
        return array;
    }
    
    public void getListByNode(List<List<Integer>> array, TreeNode root, int lvl){
        if(root==null){
            return;
        }
        
        List<Integer> l=new ArrayList<Integer>();
        int nextLvl=lvl+1;
        if(array.size()==lvl){
            array.add(l);
        }
        array.get(lvl).add(root.val);
        
        getListByNode(array, root.left, nextLvl);    
        getListByNode(array, root.right, nextLvl);
    }
    
}
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
        List<Integer> l=new ArrayList<Integer>();
        l.add(root.val);
        array.add(l);
        getListByNode(array, root, 0);
        
        
        return array;
    }
    
    public void getListByNode(List<List<Integer>> array, TreeNode root, int lvl){
        List<Integer> l=new ArrayList<Integer>();
        int nextLvl=lvl+1;
        if(root.left!=null){
            l.add(root.left.val);
            
        }
        if(root.right!=null){
            l.add(root.right.val);
            
        }
        if(l.size()>0){
            if(array.size()<=nextLvl){
                array.add(l);
            }else{
                    array.get(nextLvl).addAll(l);
            }
            
            if(root.left!=null){
                getListByNode(array, root.left, nextLvl);    
            }
            if(root.right!=null){
                getListByNode(array, root.right, nextLvl);
            }
        }
    }
}
class Solution {
    public int kthSmallest(TreeNode root, int k) 
    {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);

        return list.get(k-1);
    }

    private void inorder(TreeNode root,List<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }


}
package GFG_POTD;

import org.w3c.dom.Node;

public class Flatten_BST_to_sorted_list {
    static Node prev;
    public Node flattenBST(Node root) {
       Node dummy = new Node(-1);
        prev = dummy;
        
        Inorder(root);
  
        prev.left = null;
        prev.right = null;
        Node ret = dummy.right;
  
        return ret;
    }
    
    private void Inorder(Node curr)
    {
        if (curr == null)
            return;
        
        Inorder(curr.left);
        prev.left = null;
        prev.right = curr;
        prev = curr;
        Inorder(curr.right); // Code here
    } 
}

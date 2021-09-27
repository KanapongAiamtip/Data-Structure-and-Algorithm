public class BT {
    private BTNode root;

    public BT() { // constructor
        root = null;
    }

    public boolean isEmpty() {
        return root != null;
    }

    public void insert(int data) { // insert
        root = insert(root, data);
    }

    private BTNode insert(BTNode node, int data) {
        if (node == null)
            node = new BTNode(data);
        else {
            if (node.right == null)
                node.right = insert(node.right, data); // recursive
            else
                node.left = insert(node.left, data); // recursive
        }
        return node;
    }

    public int countNodes() { // count node in tree
        return countNodes(root);
    }

    private int countNodes(BTNode r) { // count node
        if (r == null)
            return 0;
        else {
            int n = 1;
            n += countNodes(r.left); // recursive left
            n += countNodes(r.right); // recursive right
            return n;
        }
    }

    public boolean search(int val) {
        return search(root, val);
    }

    private boolean search(BTNode r, int val) {
        if (r.data == val)
            return true;
        if (r.left != null)
            if (search(r.left, val))
                return true;
        if (r.right != null)
            if (search(r.right, val))
                return true;
        return false;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(BTNode r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(BTNode r) {
        if (r != null) {
            System.out.print(r.data + " ");
            preorder(r.left);
            preorder(r.right);
        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(BTNode r) {
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " ");
        }
    }
}
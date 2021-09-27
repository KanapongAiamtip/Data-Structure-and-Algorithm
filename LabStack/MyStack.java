public class MyStack {
    private int size;
    private LinkedNode root;

    private static class LinkedNode {
        Object element;
        LinkedNode next;

        public LinkedNode(Object obj, LinkedNode node) {
            this.element = obj;
            this.next = node;
        }
    }

    public MyStack() {
        root = null;
        size = 0;
    }

    public void push(Object obj) {
        LinkedNode p = new LinkedNode(obj, null);
        p.next = root;
        root = p;
        size++;
    }

    public String toString() {
        String ans = "";
        LinkedNode p = this.root;
        while (p != null) {
            ans = ans + p.element + ", ";
            p = p.next;
        }
        return ans;
    }

    public boolean isEmpty() {
        if(root == null){
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public Object pop() {
        root = root.next;
        size--;
        return root.element;
    }

    public Object peek() {
        return root.element;
    }
}

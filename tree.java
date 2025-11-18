public class tree {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null)
            return new Node(val);

        if(val < root.data)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }

    public static boolean search(Node root, int key) {
        if(root == null)
            return false;

        if(root.data == key)
            return true;

        if(key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void inorder(Node root) {
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preorder(Node root) {
        if(root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if(root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static Node delete(Node root, int val) {
        if(root == null)
            return root;

        if(val < root.data)
            root.left = delete(root.left, val);
        else if(val > root.data)
            root.right = delete(root.right, val);
        else {
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;

            Node t = root.right;
            while(t.left != null)
                t = t.left;

            root.data = t.data;
            root.right = delete(root.right, t.data);
        }
        return root;
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);

        System.out.println("Inorder:");
        inorder(root);
        System.out.println();

        System.out.println("Preorder:");
        preorder(root);
        System.out.println();

        System.out.println("Postorder:");
        postorder(root);
        System.out.println();

        root = delete(root, 70);
        System.out.println("After deleting 70:");
        inorder(root);
        System.out.println();

        System.out.println(search(root, 40) ? "40 found" : "40 not found");
    }

}

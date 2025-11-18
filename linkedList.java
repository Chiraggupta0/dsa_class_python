public class linkedList {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node insert(Node head, int val) {
        Node newNode = new Node(val);

        if(head == null)
            return newNode;

        Node temp = head;
        while(temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }

    public static Node delete(Node head, int val) {
        if(head == null)
            return head;

        if(head.data == val)
            return head.next;

        Node temp = head;
        while(temp.next != null && temp.next.data != val)
            temp = temp.next;

        if(temp.next == null) {
            System.out.println("Value not found.");
            return head;
        }

        temp.next = temp.next.next;
        return head;
    }

    public static int search(Node head, int key) {
        int index = 0;
        Node temp = head;

        while(temp != null) {
            if(temp.data == key)
                return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = null;

        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);

        System.out.println("Linked List:");
        display(head);

        head = delete(head, 20);
        System.out.println("After deleting 20:");
        display(head);

        int pos = search(head, 30);
        if(pos != -1)
            System.out.println("30 found at index " + pos);
        else
            System.out.println("30 not found");
    }

}

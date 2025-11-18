public class queue {

    public static int enqueue(int q[], int rear, int val) {
        if(rear == q.length - 1) {
            System.out.println("Queue is full.");
            return rear;
        }
        q[++rear] = val;
        return rear;
    }

    public static int dequeue(int q[], int front, int rear) {
        if(front > rear) {
            System.out.println("Queue is empty.");
            return front;
        }
        System.out.println("Dequeued: " + q[front]);
        return front + 1;
    }

    public static int front(int q[], int front, int rear) {
        if(front > rear) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return q[front];
    }

    public static void display(int q[], int front, int rear) {
        for(int i = front; i <= rear; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int q[] = new int[5];
        int front = 0;
        int rear = -1;

        rear = enqueue(q, rear, 5);
        rear = enqueue(q, rear, 15);
        rear = enqueue(q, rear, 25);

        System.out.println("Queue:");
        display(q, front, rear);

        front = dequeue(q, front, rear);

        System.out.println("Front element: " + front(q, front, rear));

        System.out.println("Queue now:");
        display(q, front, rear);
    }

}

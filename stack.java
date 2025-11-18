public class stack {

    public static int push(int stack[], int top, int val) {
        if(top == stack.length - 1) {
            System.out.println("Stack is full.");
            return top;
        }
        stack[++top] = val;
        return top;
    }

    public static int pop(int stack[], int top) {
        if(top == -1) {
            System.out.println("Stack is empty.");
            return top;
        }
        System.out.println("Popped: " + stack[top]);
        return top - 1;
    }

    public static int peek(int stack[], int top) {
        if(top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    public static void display(int stack[], int top) {
        for(int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int stack[] = new int[5];
        int top = -1;

        top = push(stack, top, 10);
        top = push(stack, top, 20);
        top = push(stack, top, 30);

        System.out.println("Stack:");
        display(stack, top);

        top = pop(stack, top);

        System.out.println("Top element: " + peek(stack, top));

        System.out.println("Stack now:");
        display(stack, top);
    }

}

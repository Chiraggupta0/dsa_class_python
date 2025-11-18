import java.util.Scanner;

public class array {

    public static int insert(int arr[], int size, int element) {
        if(size >= arr.length) {
            System.out.println("Array is full, cannot insert.");
            return size;
        }
        arr[size] = element;
        return size + 1;
    }

    public static int delete(int arr[], int size, int element) {
        int index = -1;

        for(int i = 0; i < size; i++) {
            if(arr[i] == element) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            System.out.println("Element not found.");
            return size;
        }

        for(int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return size - 1;
    }

    public static int search(int arr[], int size, int key) {
        for(int i = 0; i < size; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void display(int arr[], int size) {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int size = 0;

        size = insert(arr, size, 10);
        size = insert(arr, size, 20);
        size = insert(arr, size, 30);

        System.out.println("After inserting elements:");
        display(arr, size);

        size = delete(arr, size, 20);
        System.out.println("After deleting 20:");
        display(arr, size);

        int pos = search(arr, size, 30);
        if(pos != -1)
            System.out.println("30 found at index " + pos);
        else
            System.out.println("30 not found");

        sc.close();
    }
}

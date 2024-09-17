import java.util.*;

public class Linear_Search {
    public static void main(String args[]) {
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be found:");
        int k = sc.nextInt();
        linear_search(k, a);

    }

    @SuppressWarnings("unused")
    public static int linear_search(int k, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                System.out.println("Element is found at" + " " + i);
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }
}
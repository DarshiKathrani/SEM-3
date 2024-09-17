import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be found:");
        int k = sc.nextInt();
        int left = 0;
        int right = n - 1;
        binary_search(left, right, k, a);
    }

    public static void binary_search(int left, int right, int k, int[] a) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (a[middle] == k) {
                System.out.println("Element is found at " + middle);
                return;
            } else if (a[middle] > k) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        System.out.println("Element not found");
        return;
    }

}

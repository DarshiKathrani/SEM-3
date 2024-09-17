import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Size of count array will be:" + (max + 1));
        countSort(arr, max);
    }

    public static void countSort(int[] arr, int max) {
        int[] count = new int[max + 1];

        for (int i = 0; i <= max; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i <= max; i++) {
            count[i] = count[i] + count[i - 1];
        }
        int arr1[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        printArray(arr1);
    }

    public static void printArray(int[] arr1) {
        System.out.println("Sorted array is: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

}


import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        quickSort(arr, 0, arr.length-1);
     
        
    }

    public static void quickSort(int[] arr, int lb, int ub) {
        boolean flag=true;
        if(lb<ub){
            int i=lb;
            int j=ub+1;
            int key = arr[lb];

            while(true){
                i++;
                while(arr[i]<key){
                    i++;
                    j--;
                }
                while(arr[j]>key){
                    j--;
                }
                if(i<j){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                else{
                   
                    flag=false;
                    break;
                }

            }
             int temp=arr[j];
                    arr[j]=arr[lb];
                    arr[lb]=temp;
            quickSort(arr, lb, j-1);
            quickSort(arr, j+1, ub);
        }
}


public static void printArray(int[] arr) {
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    System.out.println();
    }
    printArray(arr);
}
}

import java.util.Scanner;
public class Selection_Sort {
     public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc  = new Scanner(System.in);
        int n  =sc.nextInt();
        int a[]= new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        
        selection_sort(a);
    }
    public static void selection_sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            int min_index=i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]<a[min_index]){
                    min_index=j;
                }
            }
            if(min_index!=i){
                int temp = a[i];
                a[i]=a[min_index];
                a[min_index]=temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
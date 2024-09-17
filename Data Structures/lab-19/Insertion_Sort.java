import java.util.Scanner;

public class Insertion_Sort {
     public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc  = new Scanner(System.in);
        int n  =sc.nextInt();
        int a[]= new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        
        insertion_sort(a);
    }
    public static void insertion_sort(int[] a){
        int i=1;
        int n=a.length;
        while (i<n) {
          int k=a[i];  
          int  j=i-1;
            while (j>=0 && a[j]>k) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=k;
            i++;
        }
          for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        }
        
    }



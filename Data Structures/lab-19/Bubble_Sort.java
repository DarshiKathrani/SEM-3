/**
 * Bubble_Sort
 */
import java.util.*;
public class Bubble_Sort {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc  = new Scanner(System.in);
        int n  =sc.nextInt();
        int a[]= new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        
        bubble_sort(a);
    }
    public static void bubble_sort(int[] a){
        int last=a.length-1;
        int exchs=0;
        for (int i = 0; i < a.length; i++) {
            
            for (int j = 0; j < last; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    exchs++;
                }
            }
            
            
        
        }
        if(exchs==0){
                System.out.println("already sorted!!");
                return;
            }else{
                last--;
            }
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j]+" ");
        }
    }
    
}
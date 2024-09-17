import java.util.*;
public class MergeSort{
    public static void main(String[] args){
        System.out.println("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int low =0;
        int high=a.length-1;
        merge_sort(a,low,high);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void merge_sort(int[] a,int low,int high){
        
        if(low<high){
        int mid=low+(high-low)/2;
        merge_sort(a,low,mid);
        merge_sort(a,mid+1,high);
        merge(a,low,mid,high);
        }
    }
    public static void merge(int a[],int low,int mid,int high){
        int h,i,j,k;
        int[] b=new int[high-low+1];
        i=0;
        h=low;
        j=mid+1;
        while(h<=mid && j<=high){
            if(a[h]<a[j]){
                b[i]=a[h];
                h++;
            }
            else{
                b[i]=a[j];
                j++;
            }
            i++;
        }
        if(h>mid){
            for(k=j;k<=high;k++){
                b[i]=a[k];
                i++;
            }
        }
        else{
            for(k=h;k<=mid;k++){
                b[i]=a[k];
                i++;
            }
        }

        for(k=0;k<b.length;k++){
            a[k+low]=b[k];
        }
    }
}
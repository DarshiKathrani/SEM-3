import java.util.*;
public class MergeUnsorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of 1st array:");
        int n = sc.nextInt();
        System.out.println("Enter the length of 2nd array:");
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        int c[] = new int[m+n];
        for (int i = 0; i < c.length; i++) {
            if(i<a.length){
                c[i] = a[i];
            }else{
                c[i] = b[i];
            }
        }
        for (int i = 0; i < c.length; i++) {
           System.out.println(c[i]); 
        }
    }
}

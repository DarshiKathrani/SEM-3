import java.util.*;
public class SmallLargePosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();         
        } 
        int s = a[0];
        int l = a[0];
        int si=0 , li=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] < s){
                s = a[i];
                si = i;
            }else if(a[i] > i){
                l = a[i];
                li = i;
            }
            
        }
        System.out.println("Index of smallest number is:"+si);
        System.out.println("Index of largest number:"+li);

    }
}

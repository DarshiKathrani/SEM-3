import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("Array does not duplicate numbers");
        }
        else{
            System.out.println("Array contains duplicate elements");
        }
    }
    
}

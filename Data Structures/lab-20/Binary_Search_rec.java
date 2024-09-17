import java.util.Scanner;

public class Binary_Search_rec {
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
        int ans=binary_search_rec(left, right, a,k);
        System.out.println(ans);

    }
    public static int binary_search_rec(int left,int right,int[] a,int k){
        while(left<=right){
            int middle=(left+right)/2;
            if(a[middle]==k){
                return middle;
            }
            else if(k>a[middle]){
               return binary_search_rec(middle+1, right, a, k);
            }else{
               return binary_search_rec(left, middle-1, a, k);
            }

        }
        return -1;
    }
}

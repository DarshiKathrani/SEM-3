import java.util.*;
public class FactorialRecursions{
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int factorial = fact(n);
        System.out.println(factorial);
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
}
import java.util.Scanner;
public class OddOrEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the number:");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("THe number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
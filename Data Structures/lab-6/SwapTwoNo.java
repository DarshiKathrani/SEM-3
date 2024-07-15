/**
 * SwapTwoNo.
 */
import java.util.*;
class Swap{
    int a;
    int b;

public static void swapNo(int a,int b){
    int temp;
    temp=a;
    a=b;
    b=temp;
    System.out.println(a);
    System.out.println(b);
}
}
public class SwapTwoNo{
    public static void main(String[] args) {
        Swap s = new Swap();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
         s.swapNo(n1,n2);
    }
    

    
}
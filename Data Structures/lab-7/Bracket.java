import java.util.*;
public class Bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of testcases:");
        int T = sc.nextInt();
        int i=0;
        while(i<T){
            String s = sc.next();
            System.out.println(isBalanced(s)?1:0);
            i++;
        }
        
    }
    public static boolean isBalanced(String input){
        Stack<Character> stack =new Stack<>;
            
    }
    
}

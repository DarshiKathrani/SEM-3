import java.util.*;
public class VowelOrNot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char l = sc.next().charAt(0);
        if(l=='a'|| l=='A' || l=='e' || l=='E' || l=='o' || l=='i' || l=='I' || l=='O' || l=='u' || l=='U'){
            System.out.println("The character is vowel");
        }else{
            System.out.println("The character is not vowel");
        }
    }
}
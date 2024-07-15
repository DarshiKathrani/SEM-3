import java.util.*;
public class Temperature {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int t = sc.nextInt();
        if(ch=='c'){
            toF(t);

        }
        if(ch=='f'){
            toC(t);

        }

    }
    public static void toF(float t){
        float ans =((9/5)*t)+32;
        System.out.println(ans);
    }
    public static void toC(float t){
        float ans = (t-32)*(5/9);
        System.out.println(ans);
    }
}

import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] a = new String[N];
        for(int i=0;i<a.length;i++){
            a[i] = sc.next();
        }
        System.out.println("generating a random number:");
        int m = (int)(Math.random()*N-1);
        System.out.println("Enter the word at random index "+m);
        String s = sc.next();
        int count =0;
        if(a[m].length()!=s.length()){
            System.out.println("Not Anagram");
        }else{
            char[] c1 = a[m].toCharArray();
            char[] c2 = s.toCharArray();

           Arrays.sort(c1);
           Arrays.sort(c2);

           for(int i=0;i<c1.length;i++){
            if(c1[i]==c2[i]){
                count++;
           }
        }
           if(count!=0){
            System.out.println("anagram");
        }else{
            System.out.println(" not Anagram");
        }
        
    }
    }
}

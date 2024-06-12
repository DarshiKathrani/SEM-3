import java.util.*;
public class AreaOfCircle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();
        double area;
        area = Math.PI*r*r;
        System.out.println(area);
    }
}
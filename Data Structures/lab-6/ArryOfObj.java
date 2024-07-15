/**
 * ArryOfObj
 */
import java.util.*;
class Student_Details{
    int enrollment_no;
    String name;
    int semester;
    double cpi;

    public Student_Details(){
        Scanner sc = new Scanner(System.in);
        enrollment_no = sc.nextInt();
        name = sc.next();
        semester = sc.nextInt();
        cpi = sc.nextDouble();
    }
}
public class ArryOfObj {

    public static void main(String[] args) {
        Student_Details[] student = new Student_Details[5];
        for(int i=0;i<student.length;i++){
            student[i] = new Student_Details();
            System.out.println(student[i].enrollment_no);
            System.out.println(student[i].name);
            System.out.println(student[i].semester);
            System.out.println(student[i].cpi);

        }
    }
}
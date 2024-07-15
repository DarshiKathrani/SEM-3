/**
 * Emp_Details
 */
import java.util.*;
class Employee_Details{
    int employee_id;
    String name;
    String designation;
    int salary;

    void readDetails(){
        Scanner sc = new Scanner(System.in);
        employee_id=sc.nextInt();
        name = sc.next();
        designation = sc.next();
        salary = sc.nextInt();
    }
    void displayDetails(){
        System.out.println(employee_id);
        System.out.println(name);
        System.out.println(designation);
        System.out.println(salary);
    }
}
public class Emp_Details {

    public static void main(String[] args) {
        Employee_Details employee = new Employee_Details();
        employee.readDetails();
        employee.displayDetails();
    }
}
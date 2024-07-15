import java.util.*;
class BankAccount{
    int accno;
    double balance;
    String accholder;
    String name;

    Scanner sc = new Scanner(System.in);

    public BankAccount(){
        accno = sc.nextInt();
        balance = sc.nextDouble();
        accholder = sc.next();
        name = sc.next();
    }
    void deposit(){
        double amt = sc.nextDouble();
        balance=balance+amt;
        System.out.println(balance);
    }
    void withdraw(){
        double amt1 = sc.nextDouble();
        if(amt1>0){
        balance = balance-amt1;
        }else{
            System.out.println("Not enough balance");
        }
        System.out.println(balance);
    }
    void displayBalance(){
        System.out.println(balance);
    }
}
public class Bank {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BankAccount[] b = new BankAccount[n];
    for (int i = 0; i < b.length; i++) {
        b[i] = new BankAccount();
        b[i].displayBalance();
        b[i].deposit();
        b[i].withdraw();
        b[i].displayBalance();
    }

   } 
}

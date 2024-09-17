import java.util.*;
class LL{
    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info=data;
        }
    }
        Node first=null;
        public void insertInLL(int data){
            Node newNode=new Node(data);
            if(first==null){
                first=newNode;
            }
            else{
                Node save=first;
                while(save.link!=null){
                    save=save.link;
                }
                save.link=newNode;
            }
        }
        public void nthFromLast(int n){
            Node main_ptr=first;
            Node ref_ptr=first;

            for(int i=0;i<n;i++){
                ref_ptr=ref_ptr.link;
                if(ref_ptr.link==null){
                    System.out.println("Nth from last does not exist");
                }
            }
            while(ref_ptr!=null){
                ref_ptr=ref_ptr.link;
                main_ptr=main_ptr.link;
            }
            System.out.println(main_ptr.info);
        }
        }
public class LastNth {
     public static void main(String[] args) {
        LL l =new LL();
        boolean flag=true;
        while(flag){
            System.out.println("Enter 1 to insert node in ll");
            System.out.println("Enter 2 to get nth element from last");
            Scanner sc = new Scanner(System.in);
            int o = sc.nextInt();
            if(o==1){
                System.out.println("Enter the element to be inserted");
                int x = sc.nextInt();
                l.insertInLL(x);
            }
            if (o==2) {
                System.out.println("Enter the n");
                int n=sc.nextInt();
                l.nthFromLast(n);
                flag=false;
                break;
            }

        }
     }
    }


import java.util.*;
class LL{
    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info=data;
            this.link=null;
        }
    }
    Node first = null;
    public void insertInLL(int data){
        Node newNode = new Node(data);
        if(first==null){
           first=newNode;
        }
        else{
            Node save =first;
            while(save.link!=null){
                save=save.link;
            }
            save.link=newNode;
        }
    }
    public void find_middle(Node first){
        Node temp1=first;
        Node temp2=first;
        while(temp2!=null && (temp2.link!=null) && temp1!=null){
            temp2=temp2.link.link;
            temp1=temp1.link;
        }
         System.out.println(temp1.info);
    }
    public void displayMiddle(){
        find_middle(first);
        
    }
    }


public class MiddleOfLL {
    public static void main(String[] args) {
        LL l = new LL();
        boolean flag=true;
        while(flag){
            System.out.println("Enter 1 to insert elements in ll");
            System.out.println("Enter 2 to exit the loop");
            Scanner sc = new Scanner(System.in);
            int o=sc.nextInt();
            if(o==1){
                System.out.println("Enter the element to be inserted");
                int x=sc.nextInt();
                l.insertInLL(x);
            }
            if(o==2){
                l.displayMiddle();
                flag=false;
                break;
            }
        }
    }
}

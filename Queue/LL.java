public class LL {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        this.next=null;


        }


        
        
    
        
    }
    static class Queue {
        static Node head;
         static Node tail;  
        Queue(){
            head=null;
            tail=null;


        }

        public static boolean isempty(){
            
            
            return  (head==null && tail==null);

                

            

        }
        
        public static void add(int data){
            Node newnode=new Node(data);
            if(isempty()){
                head=tail=newnode;
                return ;
                
            }
            tail.next=newnode;
            tail=tail.next;



        }
public static  int remove(){
    if(isempty()){
        return -1;

    }
    int val=head.data;
    if (head==tail){
        head=tail=null;
    }else{
        head=head.next;

    }
    return val;


}
public static int peek(){
    if(isempty()){
        return 
        -1;
    }
    return head.data;

}


    
        
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        while(!q.isempty()){
            System.out.println(q.peek());
            q.remove();

        }

    }
    
}

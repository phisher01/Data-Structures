
public class ll {
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;

        }


    }
    static class  stack {
        static Node head=null;
        public static boolean isempty(){
            return head==null;
        }

        public static void push(int data){
            Node newnnode=new Node(data);
            if(isempty()){
                head=newnnode;
                return ;


            }

            newnnode.next=head;
            head=newnnode;
        

        }
        //pop
        public static int pop(){
            if(isempty()){
                return -1;

            }
            int top=head.data;
            head=head.next;
            return top;
            
        }
        public static int peek(){
            if(isempty()){
                return -1;
    
            }
            int top=head.data;
            return top;

        }
    }
    public static void main(String[] args) {
        stack s=new stack();
        System.out.println(s.head);
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        while(!s.isempty () ){
            // System.out.println(s.peek());
            System.out.println(s.pop());
        }
        System.out.println(s.pop());
    }

    
}

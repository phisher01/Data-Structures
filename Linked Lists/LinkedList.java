

public class LinkedList {
    public static class  Node  {
        int data;
        Node next;
         public Node(int data){
            this.data=data;
            this.next=null;
            
            
            
            
            
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

   



    public void addFirst(int data){  //O(1)
        //1. create a new node
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=newnode;
            tail=newnode;
            return ;
            
        }
        
        //2. newnode next= head
        newnode.next=head;
        //3. head =newnode
        head=newnode;
    }
    public void addLast(int data){   //O(1)
        //1. create a new node
        Node newnode=new Node(data);
        size++;
        if(head==null){
            tail=newnode;
            head=newnode;
            return;
        }
        // 2. tail next=newnode
        tail.next=newnode;
        //3. tail=newnode
        tail=newnode;
        
    }
    public void print(){   //O(n)
        if(head==null){
            System.out.println("Linked list is empty");
            return ;
        }
        
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
            
        }
        
        
        System.out.println(" null");
    }   
    public  void add(int idx,int data){  //O(n)
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newnode=new Node(data);
        size++;
            Node temp=head;
            int i=0;
            while (i<idx-1) {
                temp=temp.next;
                i++;
                
            }
            newnode.next=temp.next;
            temp.next=newnode;



        }
        public  int  removeFirst(){  //O(1)
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            int value=head.data;
            head=head.next;
            size--;
            return value;


        }
        public  int  removeLast(){  //O(n)
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val=tail.data;
                head=tail=null;
                size=0;
                return val;

            }
            Node prev=head;

            for(int i=0;i<size-2;i++){
                prev=prev.next;
            }
            int val=tail.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;



        }
        public int itrSearch(int key){ //O(n)
            // int i=0;
            // Node temp=head;
            // while(temp!=null){
            //     if(temp.data==key){
            //         return i;
            //     }
            //     temp=temp.next;
            //     i++;



            // }

            Node temp=head;
            for(int i=0;i<=size-1;i++){ //O(n)
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;

            }
            return -1;  
        } 
        public int helper(Node head, int key){ //O(n)
            if(head==null){
                return -1;   //base case
            }
            if(head.data==key){  
                return 0;
            }
            int idx=helper(head.next, key);
            if(idx==-1){
                return idx;
            }
            return idx+1;

        }
        public  int recSearch(int key){ //O(n)-> Because of helper func
        return    helper(head,key);
    
        }
    public void itrreverse(){  //O(n)
            Node prev=null;
            Node curr=tail=head;
            Node Next=null;
             while(curr!=null){
                 Next=curr.next;
                 curr.next=prev;
                 prev=curr;
                 curr=Next;
            
                 
                 // for(int i=0;i<=size-1;i++){
                 //          Next=curr.next;
                 //          curr.next=prev;
                 //          prev=curr;
                 //          curr=Next;
                     
                 // }
                }
                head=prev;
            }
    public Node helperreverse(Node curr, Node prev,Node Next ){   //O(n)
                if(curr==null){
                   
                    return prev ;
                }

                Next=curr.next;

                curr.next=prev;
                 return helperreverse(Next, curr,Next);
            }
    public void recreverse(){  //O(n)
            tail=head;

            head=  helperreverse(head, null,null);
            
        }
    public void removefromEnd(int n){
            int i=0;
            Node temp=head;
            while(temp!=null){
                i++;
                temp=temp.next;
            }
           
            int sz=i;
    Node curr=head;
    Node prev=null;
    
    if(sz==n){
        head=head.next;
    size--;
        return ;
    }
    for(i=1;i<=sz-n;i++){
        prev=curr;
        curr=curr.next;
    
    
    }
    
    prev.next=curr.next;
    size--;
        }
        public  Node mid(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
    
            slow=slow.next;
            fast=fast.next.next;
            }
            return slow;
    
        }
        public boolean isPalindrome() {
            if(head==null || head.next==null){
                return true;
    
            }
    
            Node Mid=mid(head);
    
    
    
            Node Curr=Mid;
            Node Prev=null;
            Node Next=null;
            while(Curr!=null){
            Next=Curr.next;
            Curr.next=Prev;
            Prev=Curr;
            Curr=Next;
            }
            Node Start=head;
            Node End=Prev;
            // System.out.println(Prev.val);
            while(End!=null){
                if(Start.data!=End.data){
                    return false;
                }
                Start=Start.next;
                End=End.next;
    
            }
            return true;
    
                
            
        }
        public boolean hasCycle() {
            Node Slow =head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                Slow=Slow.next;
                fast=fast.next.next;
                if(Slow==fast){
                    return true;
                }
    
            }
            return false;
        }
        public  void removeCycle(){
            //detect cycle
            Node slow=head;
            Node fast=head;
            boolean cycle=false;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    cycle=true;
                    break;
                }

             
            }
            if(cycle==false){
                System.out.println("Doesn't have cycle");
                return ;
            }

                slow =head;
                while(slow.next!=fast.next){
                    slow=slow.next;
                    fast=fast.next;
                }
                fast.next=null;
                
            }
            public Node  merge(Node head){
                if(head==null || head.next==null){
                    return head;
                }
                //find mid
                Node slow=head;
                Node fast=head.next;
                while(fast!=null && fast.next!=null){
                    fast=fast.next.next;
                    slow=slow.next;

                }
                Node mid=slow;


                Node righthead=mid.next;
                mid.next=null;

                 Node newLeft=merge(head);
                Node newRight=merge(righthead);

                //merge
                 return mergeList(newLeft,newRight);



            }
public Node mergeList(Node head1, Node head2 ){

    Node mergedLL=new Node(-1);
    Node temp=mergedLL;
    while(head1!=null && head2!=null){

        if(head1.data<=head2.data){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;

        }else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;


        }


    }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;

        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;

        } 
        return mergedLL.next;



}

public void makeitcircle(){
    tail.next=head;

}
           

    public static void main(String[] args) {
        

        // LinkedList ll=new LinkedList();
        // // ll.print();
        // ll.addFirst(2);
       
        // // ll.print();
        // ll.addFirst(1);
        // // ll.print();
        // ll.addLast(3);
        // // ll.print();
        // ll.addLast(4);
        // // ll.add(2,20);
        
        // ll.print();
        // // System.out.println(ll.removeFirst());
        // ll.print();
        // // System.out.println(ll.removeLast());
        // // System.out.println(ll.size);
        // ll.print();
        // System.out.println(ll.size);
        // // System.out.println(ll.itrSearch(20));
        // // System.out.println(ll.itrSearch(90));
        // // System.out.println(ll.recSearch(20));
        // // System.out.println(ll.recSearch(90));
        
        // // ll.itrreverse();
        // // ll.recreverse();
        // ll.removefromEnd(3);
        // ll.add(2, 3);
        // ll.removeLast();
        // ll.addLast(1);
        // ll.print();
        // // System.out.println(ll.isPalindrome());
        // ll.removefromEnd(2);
        // ll.print();
        // System.out.println(ll.isPalindrome());
        // System.out.println(ll.hasCycle());
        
        // // System.out.println(ll.size);
      

        LinkedList ll2=new LinkedList();
        ll2.addLast(2);
        ll2.addLast(9);
        ll2.addLast(4);
        ll2.addFirst(7);
        ll2.addFirst(3);
        // ll2.tail.next=head.next;
        // 1->2->3->2
        // System.out.println(ll2.hasCycle());
        // ll2.removeCycle();
        // ll2.print();
        // System.out.println(ll2.hasCycle());
// System.out.println(ll2.isPalindrome());
ll2.print();
// System.out.println(ll2.head.data);
ll2.head=ll2.merge(ll2.head);
ll2.removeLast();
ll2.print();
// ll2.makeitcircle();
// ll2.print();
        

    }
}
    

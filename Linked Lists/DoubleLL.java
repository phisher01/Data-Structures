
public class DoubleLL {
    public static class Node{
        int data;
        Node  next;
        Node prev;
        Node(int data){
            this.data=data;
            prev=null;
            next=null;

}
    }
public static Node head;
public static Node tail;
public static int size;


//add
public  void addFirst(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;

    }
    head.prev=newNode;
    newNode.next=head;
    head=newNode;



}
public void addLast(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return ;

    }
    tail.next=newNode;
    newNode.prev=tail;
    tail=newNode;


}
public  int removeLast(){
    if(head==null){
        System.out.println("DLL is empty");
        return  Integer.MIN_VALUE;
    
        } else if(size==1){
            int data=head.data;
            head=tail=null;
            size--;
            return data;
        }
        int data=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return data;



}
public int removeFirst(){
    if(head==null){
    System.out.println("DLL is empty");
    return  Integer.MIN_VALUE;
    }
    else if(size==1){
        int data=head.data;
        head=tail=null;
        size--;
        return data;
    }
    
    int data=head.data;
head=head.next;
head.prev=null;
size--;

return data;
}
public void print(){
   
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"<->");
        temp=temp.next;
    }
    System.out.println("null");
}

public void reverse(){

    Node curr=tail=head;
    Node next=null;
    Node prev=null;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        curr.prev=next;
        prev=curr;
        curr=next;

    }
    head=prev;



}
public void makeitCircle(){
    tail.next=head;
    head.prev=tail;

}
    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.print();
        
        System.out.println(dll.removeFirst());
        dll.print();
    //     System.out.println(    dll.removeFirst());
    //     dll.print();
    //     System.out.println(    dll.removeLast());
    //     dll.print();
    // System.out.println(    dll.removeLast());
    // dll.print();
    // System.out.println(dll.size);
    dll.reverse();
    dll.print();
    dll.makeitCircle();
    dll.print();



    }
    
}
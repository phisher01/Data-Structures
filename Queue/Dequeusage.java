import java.util.*;
public class Dequeusage {
     static class Stack {
         static Deque <Integer> deque=new LinkedList<>();

        public static boolean isEmpty(){
            return deque.isEmpty();
        }

        public static void push(int data){


            deque.addLast(data);
            // return data;
        }
        public static int pop(){
            if(isEmpty()){
                
                return -1;
            }

            return deque.removeLast();


        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return deque.getLast(); 
        }

    }
        static class Queue {
            static Deque<Integer>  d=new LinkedList<>();
            public static boolean isEmpty(){
                return d.isEmpty();

            }
            public static void  add(int data){
                d.addLast(data);

            }
            public static int remove(){
                if(isEmpty()){
                    
                    return -1;}
    
                return d.removeFirst();

            } 
        public static int peek(){
            if(isEmpty()){
               
                return -1;

            }
            return d.getFirst();
        }


        
            
        }
    

        
    
    public static void main(String[] args) {
      
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Peek is "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

       
        Queue q=new Queue();
       q.add( 1);
    q.add(2);
    q.add(3);
    q.add(    4);
       q.add( 5);
       System.out.println("Queue is there");
        System.out.println("Peek is "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
       


    }
    
}   

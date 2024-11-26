public class circular {
    static class Queue {
        static int arr[];
        static int size;
        static  int rear;
        static  int front;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;



        }
        public static boolean isempty(){ //o(1)
            return rear==-1 && front==-1;

        }

        public static boolean isfull(){
            return  (rear+1)%size==front;
        }


         public static void add(int data){//o(1)
            if(isfull()){
                System.out.println( "Queue is full");
                return;
            }

            
            //  1st time addtion
            if(front==-1){
                front=0;

            }

            rear=(rear+1)%size;
            arr[rear]=data;

        }
        public static int remove(){ //o(1)
            if(isempty()){
                    System.out.println("queue is empty");
                    return -1;
            }

            int result =arr[front];

            // last ele case
            if(front==rear){
                front=rear=-1;

            }else{
                front=(front+1)%size;
            }
            
            return result;
            
            



        }
        public static int peek(){//o(1)
            if(isempty()){
                System.out.println("Queue is empty");
                return  -1;
            }
            return arr[front];

            }

        }

    
        
    

    public static void main(String[] args) {
        Queue   q=new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.err.println(q.remove());
        q.add(5);
        //1 2 3

        
        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}

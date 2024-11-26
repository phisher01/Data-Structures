 public class base {
    static class Queue {
        static int arr[];
        static int size;
        static  int rear;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;



        }
        public static boolean isempty(){ //o(1)
            return rear==-1;
        }
         public static void add(int data){//o(1)
            if(rear==size-1){
                System.out.println( "Queue is full");
                return;
            }
            rear++;
            arr[rear]=data;

        }
        public static int remove(){ //o(n)
            if(isempty()){
                    System.out.println("queue is empty");
                    return -1;
            }
            int front =arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];


            }
            rear--;
            return front;



        }
        public static int peek(){//o(1)
            if(isempty()){
                System.out.println("Queue is empty");
                return  -1;
            }
            return arr[0];

            }

        }

    
        
    

    public static void main(String[] args) {
        Queue   q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        //1 2 3
        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }

        
    }
}
import java.util.LinkedList;
import java.util.Queue;


public class interleave {
    public static  void interLeave(Queue <Integer>q1){
        

 Queue <Integer> q2=new LinkedList<>();
 int size=q1.size();


for(int i=1;i<=size/2;i++){
    q2.add(q1.remove());

}

// Queue <Integer> q3=new LinkedList<>();
while (!q2.isEmpty() ) {
    q1.add(q2.remove());
    q1.add(q1.remove());

    
}  

//  return q1;



 


    }
  public static void main(String[] args) {
  

 Queue <Integer> q=new LinkedList<>();
 q.add(1);
 q.add(2);
 q.add(3);
 q.add(4);
 q.add(5);
 q.add(6);
 q.add(7);
 q.add(8);
 q.add(9);
 q.add(10);

 System.out.println(q);
interLeave(q);
System.out.println(q);



  }
}

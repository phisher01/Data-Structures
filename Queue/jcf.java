import java.io.InvalidObjectException;
import java.util.*;
import java.util.function.IntToLongFunction;
public class jcf {

    
public static void interleave(Queue<Integer> q1){
    int size=q1.size();

    Queue <Integer> q=new LinkedList<>();

    for(int i=1;i<=size/2;i++){
        q.add(q1.remove());
    }
    while (!q.isEmpty()) {
        q1.add(q.remove());
        q1.add(q1.remove());

       

        
    }   



}
public static void  nonRepeating(String str){
    Queue <Character> q=new LinkedList<>();
    int map[]=new int[26];
    // StringBuilder sb=new StringBuilder("");


    for(int i=0;i<=str.length()-1;i++){
        char ch=str.charAt(i);

        q.add(ch);
        map[ch-'a']++;
    while(!q.isEmpty() && map[q.peek()-'a']>1){
        q.remove();
        

    }
    if(q.isEmpty()){
        // sb.append("-1");
        System.out.print("-1");
    }else{
        // sb.append(q.peek());
        System.out.print(q.peek());
    }






    }

}
// import LL.Queue;

    public static void main(String[] args) {
        String str="aabccxb";
        
nonRepeating(str);
Queue<Integer> q1=new LinkedList<>();

q1.add(1);
q1.add(2);
q1.add(3);
q1.add(4);
q1.add(5);
q1.add(6);
q1.add(7);
q1.add(8);
q1.add(9);
q1.add(10);

// System.out.println(q1);
// interleave(q1);


// System.out.println(q1);

        


    
    }
}


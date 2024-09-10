import java.util.*;
public class span {
    public static void stockSpan(int stock[], int span[]){
        Stack <Integer> s=new Stack<>();
        // s.push(0);
        // span[0]=1;
        for(int i=0;i<=stock.length-1;i++){
            while(!s.empty() && stock[s.peek()]<=stock[i]){

                s.pop();
            }
            if(s.empty()){
                span[i]=i+1;
                s.push(i);
            }else{
                span[i]=i-s.peek();
                s.push(i);
            }
        }
       

    }
    public static void main(String[] args) {
        
        int [] stock={100,80,60,70,60,85,100};
        int span[]=new int[stock.length];
        stockSpan(stock,span);
        for(int i=0;i<=span.length-1;i++){
            System.out.print(span[i]+" ");
        }
    }
    
}

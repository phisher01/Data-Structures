import java.util.Stack;

public class greaterele {

    public static void main(String[] args) {
        
       
        int arr[]={6,8,0,1,3};
        int count=0;

        Stack <Integer> s=new Stack<>();

        int greater[]=new int [arr.length];
        // greater[greater.length-1]=-1;
        // s.push(arr.length-1);

        for(int i=arr.length-1;i>=0;i--){
        // for(int i=0;i<=arr.length-1;i++){
            while(!s.empty() && arr[s.peek()]<=arr[i]){ //O(1)


                s.pop();
            }
            if(s.empty()){
             
                greater[i]=-1;
                s.push(i);



            }else{
            
                greater[i]=arr[s.peek()];
                s.push(i);
            }
        }

        for(int i=0;i<=greater.length-1;i++){
            System.out.print(greater[i]+" ");
        }
      
        
    }
}
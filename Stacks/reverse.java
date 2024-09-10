import java.util.Stack;



public class reverse {
    
    public static void pushatBottom(Stack <Integer> s,int data){//O(n)
        if(s.empty()){
            s.push(data);
            return ;
        }

        int ele=s.pop();
        pushatBottom(s, data);
        s.push(ele);



    }
    public static void reverse(Stack <Integer> s){//O(n^2)
        if(s.empty()){
            return ;
        }
        int ele=s.pop();
        reverse(s);
        pushatBottom(s, ele);


    }
    public static void print(Stack <Integer> s){
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        //1,2,3,4,5
        reverse(s);
        //5,4,3,2,1
        print(s);


    }
}

import java.util.Stack;


public class JCF {
    public static void pushatBottom(Stack <Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return ;
        }

        int ele=s.pop();
        pushatBottom(s, data);
        s.push(ele);



    }
    public static String reverse(Stack <Character> s1,StringBuilder sb){
        if(s1.empty()){
            return sb.toString();
        }

        char ele=s1.pop();
        sb.append(ele);
        return reverse(s1, sb);

    }
    public static void main(String[] args) {
        
        Stack <Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // System.out.println(s.pop());
        pushatBottom(s,4);
        while (!s.isEmpty()) {
           System.out.println( s.pop());
            
        }
        Stack <Character> s1=new Stack<>();
        String str="helloworld";
        int idx=0;
        while(idx<str.length()){
            s1.push(str.charAt(idx));
            idx++;


        }


        System.out.println(reverse( s1,new StringBuilder()));

    }
    
}

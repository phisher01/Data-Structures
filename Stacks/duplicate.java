import java.util.*;
public class duplicate {
    
    public static boolean isduplicate(String str){ //O(n)

        Stack <Character> s=new Stack<>();
        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);
            if(ch!=')'){
                s.push(ch);
            }else{
                int count=0;
                
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count==0){
                    return true;// duplicate
                }else{// not duplicate
                    s.pop();
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="((a+b))";
        String str2="(a-b)";
        System.out.println(isduplicate(str1));

    }
    
}

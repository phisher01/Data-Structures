import java.util.*;;
public class isvalid {
    public static boolean isValid(String s) {

        Stack <Character> s1=new Stack<>();

        for(int i=0;i<=s.length()-1;i++){
            char ch=s.charAt(i);
            if((ch=='(')|| (ch=='{')||(ch=='[')){
                s1.push(ch);
            }else{
                
                if(s1.empty()){
                    return false;
                }
                if((s1.peek()=='('&& ch==')') || (s1.peek()=='{'&& ch=='}') ||
                (s1.peek()=='['&& ch==']')){
                    s1.pop();
                }else{
                    return false;

                }
            }
        }
    


        if(s1.empty()){
            return true;
        }else{
            return false;
        }

        
    }

    public static void main(String[] args) {
        String str="[(}])({}]}";
        String str2="[({})]";
        String str3="))([{}])";
        String str4="((([{}])";

        System.out.println(isValid(str4));
        
    }
    
}

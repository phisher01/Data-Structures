

public class permutation {
    public static void permutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1,str.length());
            permutation(newstr, ans+ch);
        }
    }
    public static void main(String[] args) {
        permutation("abc", ""); 
        
    }
    
}

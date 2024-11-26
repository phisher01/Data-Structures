

public class permutation {
    public static void permutation(StringBuilder str,StringBuilder ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           str=str.deleteCharAt(i);
         ans=ans.append(ch);
            permutation( str, ans);
            ans.deleteCharAt(ans.length()-1);
            str.insert(i,ch);


        }
    }
    public static void main(String[] args) {
        String str="abc";
        StringBuilder sb=new StringBuilder(str);
        StringBuilder sb1=new StringBuilder("");
        permutation(sb,sb1); 
        
    }
    
}

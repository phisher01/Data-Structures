import javax.print.DocFlavor.STRING;

public class Duplicate {
    public static String removeDuplicate(String str,int idx, StringBuilder sb  ,boolean map[]){
        
       

        if(idx==str.length()){
            return sb.toString();
            
        }
        
        char ch=str.charAt(idx);
        
        if(map[(ch)-'a']==true){
            return removeDuplicate(str, idx+1,sb,map);
            
        }else{
            sb.append(ch);
            map[ch-'a']=true;
            return removeDuplicate(str, idx+1,sb,map);
        }
    


    }
    public static void main(String[] args) {
         String str="appnacollege";
        
         StringBuilder str1=new StringBuilder("");
         boolean map[]=new boolean[26];
         System.out.println(removeDuplicate(str, 0, str1, map));
         System.out.println(removeDuplicate("gagan", 0, new StringBuilder(""),new boolean[26]));


    }
    
}

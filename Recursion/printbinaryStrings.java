public class printbinaryStrings {
    public static void printBinaryStrin(int n,int lastDigit,StringBuilder sb){
        
        if(n==0){
            System.out.println(sb.toString());
            return;
        }
        
            sb.append("0");
            printBinaryStrin(n-1, 0, sb);
            sb.deleteCharAt(sb.length()-1);             //deleteCharAt() delete a character at a particular index
            
            
       if(lastDigit==0){

           sb.append("1");
           printBinaryStrin(n-1, 1, sb);
           sb.deleteCharAt(sb.length()-1);
           
        
        }
       
    
    }
    public static void main(String[] args){
        printBinaryStrin(3, 0,new StringBuilder(""));
       
    }
    
}

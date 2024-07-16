public class printbinaryStrings {
    public static void printBinaryStrin(int n,int lastDigit,StringBuilder sb){
        
        if(n==0){
            System.out.println(sb.toString());
            return;
        }
        if(lastDigit==0){
            sb.append("0");
            printBinaryStrin(n-1, 0, sb);
            sb.deleteCharAt(sb.length()-1);             //deleteCharAt() delete a character at a particular index
            sb.append("1");
            printBinaryStrin(n-1, 1, sb);
            sb.deleteCharAt(sb.length()-1);
            
        }else{
            sb.append("0");
            printBinaryStrin(n-1, 0, sb);
            sb.deleteCharAt(sb.length()-1);
            
        }
        if((sb.toString())==""){
            System.out.println("empty");
        }
    
    }
    public static void main(String[] args){
        printBinaryStrin(5, 0,new StringBuilder(""));
       
    }
    
}

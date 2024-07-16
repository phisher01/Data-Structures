package Practice;
public class problem4 {
    public static int count(String str){
        int count =0;
        if(str==""){
            return 0;
        }
         
        for(int j=0;j<str.length();j++){                 
            
        String str1 =str.substring(0,j+1);
           if(str1.charAt(0)==str1.charAt(str1.length()-1)){
            count ++;
           }
        }
        return  count + count(str.substring(1 ));
    }
	public static void main(String[] args) {
// 		System.out.println("Hello World");
System.out.println(count("abcab"));
	}
    
}

public class pallindrome {
    
    public static  boolean ispalindrome(String str){
        //      int start=0;
        // int end=str.length()-1;
        // while(start<end){
        //     if(str.charAt(start)!=str.charAt(end)){
        //         //not a pallindrome
        //         return false;
        //     }
        //     start++;
        //     end--;
    // }

        for(int i=0;i<str.length();i++){
            int n=str.length();
            int end=n-i-1;
            if(str.charAt(i)!=str.charAt(end)){         //shradha 's method
                return false;

            }

        }

        
        return true;
    }
    public static void main(String args[]){

        String str="RACECAR";
        boolean a=ispalindrome(str);
        System.err.println(a);


    }
    
}

public class compareto {


    public static int compareTo(String str1,String str2){
        int shorteststringlen=Math.min(str1.length(),str2.length() );

        for(int i=0;i<shorteststringlen;i++){

            if(str1.charAt(i)-str2.charAt(i)<0){
                return str1.charAt(i)-str2.charAt(i);
            }
            else if(str1.charAt(i)-str2.charAt(i)>0){
                return str1.charAt(i)-str2.charAt(i);
            }
            
        }
        return 0;

    }
    public static void main(String args[]){
        String str1="Bananas";
        String str2="Apples";
        int x=compareTo(str1, str2);        // Userdefined compareTo fn
        System.out.println(x);
        System.out.println(str1.compareTo(str2));       // predefined compareTo fn


    }
}

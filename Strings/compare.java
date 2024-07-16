public class compare {

     public static void main(String args[]){
        String s1="Tony";           // s2 is pointing to s1 
        String s2="Tony";
        String s3=new String("Tony");   // new keyword is used hence a new string is created  
                                                // s3 is a new string

        if(s1==s2){                 // equals-to compare the strings  at object level 
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1==s3){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }



        if(s1.equals(s3)){          // comparing the value of strings here
            System.out.println("Strings are  equal");
            System.out.println(s1.equals(s3));
        }else{
            System.out.println("Strings are not equal");
        }

        char arr[]={'a','b','c','d'};
        String str="abcd";
        
     }
}
public class Stringbuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Hello");
        sb.toString();      // this fun is used to convert any object to String

        StringBuilder str=new StringBuilder("");  
        str.toString();
        
        
        
        for(char ch='a';ch<='z';ch++){      //O(n)
            str.append(ch);
            
        }
        
        //StringBuilder class has all the functions as in the String class


        System.out.println(sb);
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.substring(0,10));
        System.out.println(str.compareTo(sb));
        System.out.println('a'-'H');
        System.out.println((int)'a');

        System.out.println(str);




        String str1="GaganPratapSingh";
        StringBuilder str2=new StringBuilder("");
        for(int i=0;i<5;i++){
            str2.append(str1.charAt(i));

        }
        System.out.println(str2);
    }

    
}

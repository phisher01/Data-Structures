public class substring {
    public static String substring(String str,int si,int ei){
        String str1="";
        for(int i=si;i<ei;i++){
            str1=str1+str.charAt(i);


        }
        return str1;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(substring(str, 0, 5));
        System.out.println(str.substring(0,5));     // predefine function in String class
        System.out.println(str.substring(0, str.length()));     // predefine function in String class
        System.out.println(str.substring(1));     // predefine function in String class
        
    }
    
}

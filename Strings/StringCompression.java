public class StringCompression {
    public static String compression(String str){
        StringBuilder sb=new StringBuilder("");
        Integer count=0;
        for(int i=0;i<str.length();i++){
            count=1;
            sb.append(str.charAt(i));
            while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1 )){
                count++;
                i++;
            }
            if(count>1){
                count.toString();
                sb.append(count);
            }
    


        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String str="aaaabbbccccdddd ";
        System.out.println(compression(str));
        
    }
    
}

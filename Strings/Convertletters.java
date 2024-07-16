public class Convertletters {
    public static  String toupppercase(String str){

    StringBuilder sb=new StringBuilder("");
    // String str1="";
    char ch=Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    // str1+=ch;
    
    for(int i=1;i<str.length();i++){
        if(str.charAt(i)==' ' &&i<str.length()-1){
            sb.append(str.charAt(i));
            // str1+=str.charAt(i);
            
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
            // str1+=Character.toUpperCase(str.charAt(i));
            
            
        }
        else{
            sb.append(str.charAt(i));
            // str1+=str.charAt(i);

        }

    }
            return sb.toString();
        // return str1;

    }
    
    public static void main(String args[]){
        String str="hi, i am gagan pratap singh ";
        System.out.println(toupppercase(str));


    }
    
}

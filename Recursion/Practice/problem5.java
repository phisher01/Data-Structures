package Practice;

public class problem5 {
public static void stringReverse(String str){
    if(str==""){
        return ;

    }

    char ch=str.charAt(str.length()-1);
    System.out.println(ch);;
    stringReverse(str.substring(0,str.length()-1));
}
    public static void main(String[] args) {
        stringReverse("Gagan");
        
    }
    
}

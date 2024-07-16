package Practice;

public class problem3 {
    public static int length(String str){
        if(str==""){
            return 0;
        }

        return 1+ length(str.substring(1));
    }
    public static void main(String[] args) {
        
        System.out.println(length("Gagan"));
        System.out.println(length("Gagan Pratap Singh"));
    }
    
}

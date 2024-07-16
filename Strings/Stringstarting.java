import java.util.*;

public class Stringstarting{
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();

    }
    public static void main(String args[]){
        char arr[]={'a','b','c','d'};   // character type array
        String str1="Intelligent";
        String str2=new String("@#123Here");

    // Programmatically same but their implementation are not
    //Strings are immutable
    
    // System.out.println("Enter the string");
    // Scanner sc=new Scanner(System.in);
    // String name =sc.nextLine();             // Inputting the string 
    // System.out.println(name);


    // String fullName="Tony Stark";
    // System.out.println(fullName.length());      // length() is function associated with String class


    //concatenation    + operator

    String firstname="Gagan";
    String lastname="Singh";
    String fullname=firstname+" "+lastname;
    // System.out.println(fullname.charAt(1));


    // System.out.println("My age is "+ 20);



    printletters(fullname);


 








}

    
}
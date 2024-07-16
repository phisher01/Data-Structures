import java.util.*;
public class arraycreation{
    public static void main(String args[]){
        int marks[]=new int[5];
        int marksmore[]={4,5,6,23};
        String fruits[]={"Apple","Banana","Chiku"};
        Scanner sc=new Scanner(System.in);

        marks[0]=sc.nextInt();// inputing elements of arrays
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("The marks of phy="+ marks[0]);//Outputiing elements of arrays 
        System.out.println("The marks of chem="+ marks[1]);
        System.out.println("The marks of bio="+ marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);
        
        
        marks[0]=100;// updation
        System.out.println("After updating");
        System.out.println("The marks of phy="+ marks[0]); 
        System.out.println("The lenth of marks array is "+ marks.length);

    }}
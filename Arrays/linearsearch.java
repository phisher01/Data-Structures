import java.util.*;
public class linearsearch {
    public static int linearsearch(String numbers[],String key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
     public static int largest(int numbers[]){
            int largest=Integer.MIN_VALUE;
            int smallest=Integer.MAX_VALUE;
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]>largest){
                    largest=numbers[i];
                }
            }
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]<smallest){
                smallest=numbers[i];
                }
            }
            System.out.println("THe smallest element in the given array is: "+smallest);
            return largest;
     }

    public static void main(String args[]){
        // int numbers[]={3,8,12,25,4,78,99,51};
        String Dishes[]={"Samosa","Pav bhaji", "Bread pakora", "Aloo tikki"};
        // System.out.println(Dishes.length);
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number you want to search ");
        // String dish=sc.nextLine();
        // System.out.println(dish);
        // int index=linearsearch(Dishes,dish);
        
        // if(index==-1){
        //     System.out.println("Not Found");
            
        // }
        // else{
        //     System.out.println("Key is present at index : "+index); 
        // } 


        int numbers[]={34,67,23,90,12,99,84,63,88};
        int largest=largest(numbers);
        System.out.println("The largest element in the arrayy is: "+largest);
    }}
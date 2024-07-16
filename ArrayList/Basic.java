
import java.util.ArrayList; 
import java.util.Collections; 
public class Basic {

    public static void main(String[] args) {
        
        ArrayList<Integer> List=new ArrayList<>();

        //adding element
    List.add(1);
    List.add(2);
    List.add(3);        //O(1)
    List.add(4);
    List.add(5);
    List.add(1,9);      //O(n)
    System.out.println(List);



    //get operation
    int element=List.get(2);        //O(1)
    System.out.println(element);
    


    //delete element
    List.remove(2);
    System.out.println(List);       //O(n)


    //set operation

    List.set(2,10);         //o(n)
    System.out.println(List);


    //contains
    System.out.println(List.contains(1));               //O(n)
    System.out.println(List.contains(11));


System.out.println(List);

    System.out.println("The length of arrayList is: "+List.size());
    
    // //O(n)
    // for(int i=List.size()-1;i>=0;i--){
        //     System.out.print(" "+List.get(i)+" ");
        // }
        
        Collections.sort(List); //Ascending order
        Collections.sort(List,Collections.reverseOrder()); //Descending order
        for(int i=0;i<List.size();i++){
            System.out.print(" "+List.get(i)+" ");
    
        }
        System.out.println();
        
        
    }





}
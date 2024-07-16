import java.util.*;


public class Inbuiltsort {
    public static void  print(Integer a[]){
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+ " ");
    }
}
    public static void main(String args[]){
        Integer arr[]={4,2,7,10,0,12};
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        print(arr);

    }
    
}

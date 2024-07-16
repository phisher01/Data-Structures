import java.util.*;

public class max {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);



    }
    public static void main(String args[]) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int max=Integer.MIN_VALUE;
        //O(n)
        for(int i=0;i<list.size();i++){
            // if(list.get(i)>max){
            //     max=list.get(i);
            // }
            max=Math.max(max,list.get(i));
        }
        System.out.println("The maximum element is: "+max);
        System.out.println();
        System.out.println();
        System.out.println();
        

        System.out.println(list);
        int idx1=1;
        int idx2=3;
        swap(list, idx1, idx2);
        System.out.println("After swaping----");
        System.out.println(list);
        


    }
    
}

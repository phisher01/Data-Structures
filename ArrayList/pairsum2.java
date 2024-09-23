import java.util.*;

public class pairsum2 {
    public static String  pairSum(ArrayList <Integer> list,int target ){

        // Two pointer 
        int lp=0;
        int rp=list.size()-1;

        for(int i=0;i<=list.size()-2;i++){
            if(list.get(i)>list.get(i+1)){
                lp=i+1;
                rp=i;
break;
            }
        
        }
        String str="";
        
        while(lp!=rp){
            // System.out.println("there");
            // System.out.println(list.size());
            // System.out.println(lp);
            int value=list.get(lp)+list.get(rp);

            // System.out.println(value);
            if(value==target){
                str=str+list.get(lp)+" "+list.get(rp);

                return str;

            }else if(value<target){
                lp=(lp+1)%list.size();
                
                
                
            }else{
                rp=(rp-1+list.size())%list.size();
                // System.out.println(rp);
            }

        }
        return str;
       
            


    }
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        ArrayList <Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        System.out.println(pairSum(list, 19));
        System.out.println(pairSum(list1, 5));



        

    }
}

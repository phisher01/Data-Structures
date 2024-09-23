import java.util.*;
public class pairsum {
    public static String  pairSum(ArrayList <Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
       String str="";
        while(lp<rp){
            int value=list.get(lp)+list.get(rp);
            if(target==value){
                // add[0]=list.get(lp);
                // add[1]=list.get(rp);
                str=str+list.get(lp);
                str=str+list.get(rp);
                return str;
// 
            }else if(value<target){
                lp++;

            }else{
                rp--;
            }
        }
        // return add;
        return str;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        System.out.println(pairSum(list,5));
        
    }
    
}

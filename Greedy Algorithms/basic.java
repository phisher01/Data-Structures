import java.lang.reflect.Array;
import java.util.*;
public class basic {

    public static void main(String[] args) {
        int [] start={1,3,0,5,8,5};
        int []end=   {2,4,6,7,9,9};
        

        int activities[][]=new int[start.length][3];

        for(int i=0;i<=activities.length-1;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];

        }
        Arrays.sort(activities,Comparator.comparing(o->o[2]));



                ArrayList <Integer> ans=new ArrayList<>();
        int maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=1;i<=activities.length-1;i++){
            // lastEnd=end[ans.get(ans.size()-1)];
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        for(int i=0;i<=ans.size()-1;i++){

            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println( );

        System.out.println("maxAct is "+ maxAct);
        
    }
}
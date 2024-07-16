import java.util.*;
public class arraypassing {
    public static void update(int marks[],int n){
        n=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
    }}
    public static void main(String args[]){
        int marks[]={94,85,36};
        int nonchangable=5;
        update(marks,nonchangable);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");

    }
    System.out.println();
    System.out.println(nonchangable);
    
    }
    
}


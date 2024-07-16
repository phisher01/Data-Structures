import javax.sound.midi.SysexMessage;

public class Prefix {
    public static void  printArrays(int n[]){
        int Prefix[]=new int[n.length];
        int maximum=Integer.MIN_VALUE;
        // for(int j=0;j<Prefix.length;j++){
        //     for(int k=0;k<=j;k++){

        //         Prefix[j]=Prefix[j]+n[k];
        //     }
        // }
        Prefix[0]=n[0];
        for(int i=1;i<Prefix.length;i++){
            Prefix[i]=Prefix[i-1]+n[i];

        }
        for(int i=0;i<Prefix.length;i++){
            for(int j=i;j<Prefix.length;j++){
                int sum=(i==0)?Prefix[j]:Prefix[j]-Prefix[i-1];
                // System.out.println(sum);
                if(sum>maximum){
                    maximum=sum;
                }
            }

        }
        System.out.println("The maximum sum from these subarrays is: "+maximum);

        
        // for(int i=0;i<Prefix.length;i++){
        //     System.out.print(Prefix[i]);
        // }
    }

    public static void main(String args[]){
        int num[]={1,-2,6,-1,3};
        printArrays(num);
        
    
}
    
}

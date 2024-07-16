public class Maxsubarray {
    public static void printArrays(int arr[]){
        int ts=0;
        int maximum=Integer.MIN_VALUE;
        // int sum=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int sum=0;
                int end=j;
                // System.out.print("[");
                for(int k=start;k<=end;k++){
                    // System.out.print(" "+arr[k]+" ");
                    sum=sum+arr[k];
                   
                }
                System.out.println( sum );
                ts++;
                
                if(sum>maximum){
                maximum=sum;
            }
            }
            System.out.println();
        }
        System.out.println("The maximum sum of subarrays is :"+  maximum);
        // System.out.println("Total number of subarrays is : "+ts);

    }
    public static void main(String args[]){
        int num[]={1,-2,6,-1,3};
        printArrays(num);
        
    
}
    
}

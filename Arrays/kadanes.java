public class kadanes {
    public static void kadanes(int a[]){
        boolean check=true;
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                check=false;
            }
        }
        if(check==true){
            int maximum=Integer.MIN_VALUE;
            for(int i=0;i<a.length;i++){
                if(a[i]>maximum){
                    maximum=a[i];
                }
        }
        System.out.println("The maximum value of this negative elemented array is :"+ maximum);
        }
        else{

            int sum=0;
            int maximum=Integer.MIN_VALUE;
            for(int i=0;i<a.length;i++){
                sum=sum+a[i];
                if(sum<0){
                    sum=0;
                }
                // if(sum>maximum){
                //     maximum=sum;
                // } or can use 
                maximum=Math.max(sum,maximum );
            }
            
            System.out.println("The maximum sum of these subarrays is : "+ maximum        );
        }
        }
    public static void main(String args[]){
        // int arr[]={- 6,-9,-3,-20,-20,0,-5,-7};
        int arr[]={-2,-5,3,7,1,-10};
        kadanes(arr);

    }
    
}

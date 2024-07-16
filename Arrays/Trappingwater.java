public class Trappingwater {
    public static int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static int min(int a,int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }
    public static int trappedrainwater(int height[]){  //O(n)
        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<leftmax.length;i++){
            leftmax[i]=max(height[i],leftmax[i-1]);}
            //or
        //    int maxi=Integer.MIN_VALUE;
        //     for(int j=i;j>=0;j--){

                
        //         if(height[j]>maxi){
        //             maxi=height[j];
        //         }
        //     }
        //     leftmax[i]=maxi;
        // }
        int rightmax[]=new int[n];
        rightmax[rightmax.length-1]=height[height.length-1];
            
            
        for(int i=n-2;i>=0;i--){
            rightmax[i]=max(height[i],rightmax[i+1]);
            
        }  
        
        int tw=0;
        for(int i=0;i<n;i++){
            tw= tw + min(leftmax[i],rightmax[i])-height[i];
        }
        return tw;
    }
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
System.out.println(trappedrainwater(arr        )
);       

                    
}

            
       

    }
    

public class faltu {
    public static void zeroSort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==1 && a[j]==0){
                    int temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                // else{
                //     continue;
                // }
            }
        }
        
    }
    public  static void main(String args[]){
        int arr[]={1,0,1,1,1,0,0,0,0,1,1,0,1,0,1,0,0,1};
        System.out.println(arr.length);
        zeroSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
    }
    public static void zeroN(int a[]){// This is more optimized than above
         int start=0;
        int end=a.length-1;
         while(start<end)
         {
            if(a[start]==0){
                start++;
            }else{
                int tmp=a[end];
               a[end]=a[start];
               a[start]=tmp;
                end--;

            }
       
         }
    }
    
}

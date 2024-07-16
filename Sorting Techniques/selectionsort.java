public class selectionsort {
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
        
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minpos]){
                    minpos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;

        }
    }
    public static void main(String args[]){
        int a[]={5,8,2,10,35,25,0};
        selectionsort(a);
        for(int i=0;i<a.length;i++){
            System.out.print( " "+ a[i]);
        }
    }

}

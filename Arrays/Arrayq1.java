public class Arrayq1{
    public static  void swap(int a[]){
        int len=a.length;
        int j;
        if(len%2==0){
            j=((a.length)/2);
            
        }else{
             j=((a.length)/2)+1;
            
        }
        
        for(int i=0;i<(a.length)/2;i++){

            int temp=0;
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j++;
        }
    }
    public static void main(String args[]){
        int arr[]={10,15,5,25,33,27,60,99,45};
        swap(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+ arr[i]);
        }
    }
}
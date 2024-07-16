public class Bubblesort{
    public static void Bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int a[]={3,2,10,12,21,7};
        Bubblesort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

}
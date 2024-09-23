public class mergeSort {
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei ){
            return;
        }
        


        int mid=si+ (ei-si)/2;
        mergeSort(arr,si,mid); //left part
        mergeSort(arr,mid+1,ei); //right part
        merge(arr,si ,ei,mid);
    }

    public static void merge(int arr[],int si ,int ei,int  mid){
        int temp[]=new int[ei-si+1];
        int i=si;   //iterator for left part
        int j=mid+1;  // iterator for right part
        int k=0;        // iterator for temp arr

        while(i<=mid && j<=ei){

            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while(j<=ei){
        temp[k]=arr[j];
        k++;
        j++;
        }
        while(i<=mid){
        temp[k]=arr[i];
        k++;
        i++;
        }

        //copy temp to original array arr
        i=si;
        for( k=0;k<temp.length;k++){
            arr[i]=temp[k];
            i++;
            
        }
        
        // print(temp);
        // System.out.println();
        // print(arr);
        // System.out.println();
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,15,7};
        int arr1[]={};
        mergeSort(arr,0,arr.length-1);
        print(arr);
        
    }
}
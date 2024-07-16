public class mergeSortStrings {
    public static void mergeSort(String arr[],int si,int ei){
        if(si>=ei){
            return ;
        }
        int mid=si+(ei-si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1,ei);
        merge(arr,si,mid,ei);
        
    }

    public static void merge(String arr[],int si,int mid,int ei){
        String temp[]=new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=ei) {
            if((arr[i].compareTo(arr[j]))>0){
                temp[k]=arr[i];
                k++;
                i++;
                System.out.print(arr[i].compareTo(arr[j]));
                System.out.println("hlo");
            }
            else{

                temp[k]=arr[j];
                j++;
                k++;

            }

            
        }
        while(i<=mid){
            temp[k]=arr[i];
                k++;
                i++;

        }
        while(j<=ei){
            temp[k]=arr[j];
                k++;
                j++;

        }
        i=si;
        for( k=0;k<temp.length;k++){
            arr[i]=temp[k];
            i++;

        }
        print(arr);
        System.out.println();

    }
    public static void print(String  arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        String arr[]={"t","s","m"};
        mergeSort(arr,0,arr.length-1);
        print(arr);


    }
    
}

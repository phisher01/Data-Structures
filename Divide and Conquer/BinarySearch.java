public class BinarySearch { // Binarysearch through recursion
    public static int BinarySearch(int arr[],int si,int ei,int key){
        if(si>ei){
            return -1;
        }
        int mid=(ei+si)/2;
        if(arr[mid]==key){
            return mid;

        }
        else if(key<arr[mid]){
            return BinarySearch(arr,si,mid-1,key);

        }
        else{
            return BinarySearch(arr,mid+1,ei,key);
        }

    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,15,45,99,100};

       int indx= BinarySearch(arr,0,arr.length-1,99);
       System.out.println(indx);


        
    }
}

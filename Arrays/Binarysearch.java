public class Binarysearch {
    public static int Binarysearch(int a[], int n){
        int start=0;
        int end=a.length-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(a[mid]==n){
                return mid;// Found
            }
            else if(a[mid]>n){//Left 
                end=mid-1;
            
            }
            else{
                start=mid+1;
                
            }
    }
        return -1;
    
}
public static void main(String args[]){
    int marks[]={2,5,10,16,19,25,33,46,68,77,84,99};
    int key=99;
    int index=Binarysearch(marks, key);
    if(index==-1){
        System.out.println("Not found");

    }
    else{
        System.out.println("The element is found at position of "+ (index + 1));

    }
    // System.out.println(index+4);
    System.out.println(marks[11]);
}
}

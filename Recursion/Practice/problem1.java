package Practice;

public class problem1 {
    public static void getAllIndex(int arr[],int key,int idx){
        if(idx==arr.length){

            return;
        }
        if(key==arr[idx]){
            System.out.print(idx+ " ");

        }
        getAllIndex(arr, key, idx+1);
    }
    public static void main(String[] args) {
        int ar[]={3,2,4,5,6,2,7,2,2};
        getAllIndex(ar, 2, 0);
        
    }
    
}

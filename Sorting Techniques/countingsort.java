public class countingsort{
    public static void countingsort(int arr[]){
        int range=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){ //range is the maximum element in the array 
            range=Math.max(range,arr[i]);}

        int count[]= new int[range+1];

        
        for(int i=0;i<arr.length;i++){ // O(n)
            count[arr[i]]++;

        }
        int j=0;
        for(int i=0;i<range+1;i++){ // reverse the loop for descending order  for(int i=range;i>=0;i--)
            while(count[i]>0){          // O(range)
                arr[j]=i;                   
                count[i]--;
                j++;

            }
        }   // Total time complexity will be O(n+ range)
        

    }
    public static void  printArr(int  a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,4,7,1,3,50,2,4,3,4,7};
        // print(count );
        countingsort(arr);
        printArr(arr);
    }
}
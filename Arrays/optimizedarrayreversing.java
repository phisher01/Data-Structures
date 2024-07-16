public class optimizedarrayreversing {
    public static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        int temp=0;
        // we will just swap the first and end elements rather then creating an extra array
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int num[]={8,9,10,3,21,15,90};
        reverse(num);
        for(int i=0;i<num.length;i++){
            System.err.print(" "+num[i]);
        }


    }
}

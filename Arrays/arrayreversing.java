public class arrayreversing {
    public static void reverse(int arr1[]){
        // we are creating an array and then we will take last  elements from the array and insert into the new array  
        int arr2[]=new int[arr1.length];
        int j=0;
        for(int i=arr1.length-1;i>=0;i--){
            arr2[j]=arr1[i];
            j++;
        }
        //  we have reverse the elements in the new array and now we are copying them in the previos array
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr2[i];
        }
    }
    public static void main(String args[]){
        int num[]={8,9,10,3,21,15};
        reverse(num);
        for(int i=0;i<num.length;i++){
            System.err.print(" "+num[i]);
        }


    }
    
}

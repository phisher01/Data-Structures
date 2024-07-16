public class secondlargest{
    public static void secondlargest(int a[]){
        int maximum=Integer.MIN_VALUE;
        int maximum2=maximum;
        for(int i=0;i<a.length;i++){
            if(a[i]>maximum){

                maximum2=maximum;
                maximum=a[i];
            }
            else{
                if(maximum2<a[i]){
                    maximum2=a[i];
                }
            }
            
        }
        System.out.println("The second largest element in the array is "+ maximum2);


    }
    public static void main(String args[]){
        int arr[]={2,6 ,80,10,59};
        secondlargest(arr);

    }
}
public class arraypairs {
    public static void printPairs(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            int current=arr[i];// 8,9,10,3,21,15,90
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ current+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("The total number of elements is "+ tp);
    }
    public static void main(String args[]){
        int num[]={8,9,10,3,21,15,90};
        printPairs(num);
        
    
}
}



public class Arrays {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();;
    }
    public static void changarray(int arr[],int i,int value){
        if(i==arr.length){
            print(arr);
            return;
        }
        arr[i]=value;
        changarray(arr, i+1, value+1);
        arr[i]=arr[i]-2;
    }
    public static void main(String[] args) {
        int arr[]=new  int[5];
        changarray(arr, 0, 1);
        print(arr);

        
    }
    
}

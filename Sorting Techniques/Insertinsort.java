public class Insertinsort {
    public static void insertionsort(int ar[]){
        for(int i=0; i<ar.length-1;i++){
            int curr=ar[i+1];
            int prev=i;
            while( prev>=0 && ar[prev]>curr){
                ar[prev+1]=ar[prev];
                prev--;
                
            }
            ar[prev+1]=curr;
        }

    }

    public static void main(String args[]){
        int a[]={3,2,10,12,21,7};
        insertionsort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}

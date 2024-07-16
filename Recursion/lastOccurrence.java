public class lastOccurrence {
    public static int lastOccurrence(int arr[],int i,int key, int pos){
        
        if(i==arr.length){
            return pos;             //my approach
        }
        if(arr[i]==key){
             pos=i;


        }
        return lastOccurrence(arr, i+1, key, pos);

    }
    public static int lastOccurrence(int arr[],int i,int key){
        if(i==arr.length){
            return -1;

        }
         int pos=lastOccurrence(arr, i+1,key);


         if(pos==-1 &&  arr[i]==key){
            return i;
         }
         return pos;

        }


   



    public static void main(String[] args) {
        int arr[]={8,3,1,9,5,10,2,5,2,10};
        System.out.println(lastOccurrence(arr, 0, 5));
    }
        
        
    }

    


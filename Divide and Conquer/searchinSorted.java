public class searchinSorted {
    // public static int search(int arr[],int si,int ei,int target){
    //     if(si>ei){
    //         return -1;
    //     }

    //     //kaam
    //     int mid=(si+ei)/2;
    //     // case found
    //     if(arr[mid]==target){
    //         return mid;
    //     }
    //     // mid on L1

    //     if(arr[mid]>=arr[si]){      // mid lie on L1
    //         if(arr[si]<=target && target<=arr[mid]){
    //             return search(arr, si, mid-1, target);

    //         }else{
    //             return search(arr, mid+1, ei, target);
    //         }

    //     }
    //         // mid on  L2
    //     else{
    //         if(arr[mid]<=target && target<=arr[ei]){
    //             return search(arr, mid+1, ei, target);
    //         }else{
    //             return search(arr, si, mid-1, target);
    //         }



    //         }
    //     }


            

        
    public static int search(int arr[],int target){
        int si=0;
        int ei=arr.length-1;

       
        

        while(si<=ei){

            int mid=(si+ei)/2;
            // case found
            if(arr[mid]==target){
                return mid;
            }
            // mid on L1
            
            if(arr[mid]>=arr[si]){      // mid lie on L1
                if(arr[si]<=target && target<=arr[mid]){
                    ei=mid+1;
                    
                   
                    
                }else{
                    
                si=mid+1;
                
            }

        }
        // mid on  L2
        else{
            if(arr[mid]<=target && target<=arr[ei]){
                // return search(arr, mid+1, ei, target);
                si=mid+1;
            }else{
                // return search(arr, si, mid-1, target);
                ei=mid-1;
                
            }
            
            
            
        }
    }
    return -1;
    
        }


            

        
    public static void main(String[] args) {
     int arr[]={4,5,6,7,0,1,2};
     int target=6;
System.out.println(search(arr, target));
    }
}
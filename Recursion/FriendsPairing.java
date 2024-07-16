public class FriendsPairing {


    public static int friendsPairing(int n){
            if(n==1||n==2){
                return n;
            }
            

        int a=friendsPairing(n-1);      // Standing single
        int b=(n-1)*friendsPairing(n-2);      // Standing with pair
            return a+b;
    }
    public static void main(String args[]){
        System.out.println(friendsPairing(3));

    }
    
}

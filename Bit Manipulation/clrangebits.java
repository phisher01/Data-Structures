public class clrangebits {
    public static boolean isPowerOfTwo(int n){
        return ( n&n-1)==0;
    }

    public static int clearBitsInRange(int n,int i,int j){
        int a=(-1<<(j+1));
        int b=(1<<i)-1;
        // int b=(int)Math.pow(2, i)-1;
        int bitmask=a|b;
        n=n&bitmask;
        return n;   
    }
    public static void main(String[] args) {
        System.out.println(clearBitsInRange(10,2, 4));

        System.out.println(isPowerOfTwo(8));
        
    }
    
}

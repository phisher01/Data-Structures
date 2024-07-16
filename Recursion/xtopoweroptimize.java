public class xtopoweroptimize {             //O(logn)
    public static int optimizePower(int x,int n){
        if(n==0){
            return 1;
        }
        int pow=optimizePower(x, n/2);
        int pow1=pow*pow;
    if(n%2==0){
        return pow1;
    }else{
        return x*pow1;
         }    
}
    public static void main(String[] args) {
        System.out.println(optimizePower(2, 10));
        System.out.println(optimizePower(2, 6));
        
    }
    
}

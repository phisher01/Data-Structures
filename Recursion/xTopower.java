public class xTopower {
    public static int xTotheaPower(int x,int n){
        if(n==0){
            return 1;
        }
        return x*xTotheaPower(x, n-1);
    }
    public static void main(String[] args) {
        System.err.println(xTotheaPower(2, 10));
        System.out.println(Math.pow(2, 3));     //predifined functions
        
    }
    
}

public class fibonacci {
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib=fibonacci(n-1)+fibonacci(n-2);
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(23));
        System.out.println(fibonacci(24));
        System.out.println(fibonacci(25));
        System.out.println(fibonacci(26));
        System.out.println(fibonacci(27));
        
    }
    
}

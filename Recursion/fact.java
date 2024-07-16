public class fact {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int factorial=n*fact(n-1);
        return factorial;

    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        
    }
    
}

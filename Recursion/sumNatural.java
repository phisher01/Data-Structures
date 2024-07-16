public class sumNatural{
    public static int sumNat(int n){
        if(n==1){
            return 1;
        }
        int sum=n+sumNat(n-1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumNat(5));
        
    }
}

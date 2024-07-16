public class oddoreven {
public static void OddorEven(int n){
    int bitmask=1;
    if((n & bitmask)==0){
        System.out.println("Even");
    }else{
        System.out.println("Odd");
    }

}
    public static void main(String[] args) {
        OddorEven(1);
        OddorEven(11);


        OddorEven(22);
        OddorEven(43);
        
    }
}
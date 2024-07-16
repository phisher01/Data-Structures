public class swap {
    public static void main(String[] args) {
        int x=3;
        int y=4;
        x=x^y;   //x+y
        y=x^y;  //x-y
        x=x^y;  //x-y
        System.out.println("The value of x is " +x);
        System.out.println("The value of y is " +y);
    }
    
}

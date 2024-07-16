class clearbits{
    public static int clearIthBit(int n, int i ){
        int bitmask= ~(1<<i);
        n=n&bitmask;
        return n;}

    public static int clearbits(int n,int i){
        // for(int j=0;j<i;j++){
        //     n=clearIthBit(n, j);
        // }
        // return n;


        int bitmask=-1<<i;          // (~0)<<i;
        n=n&bitmask;        
        return n;
    }
    public static void main(String[] args) {
        System.out.println(clearbits(15, 2));
        
    }
}
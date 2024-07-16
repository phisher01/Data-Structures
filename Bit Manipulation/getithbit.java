public class getithbit {

    public static void printBinary(int n){
        int i=31;
        while(i>=0){
        System.out.print(     getIthBit(n,i));
        i--;
        }

    }

    public static int updateIthBit(int n, int i , int newbit){
        // if(newbit==0){
        //     n=clearIthBit(n, i);
        //     return n;
            

        // }
        // else{
        //     n=setIthBit(n, i);
        //     return n;
        // }


        // 2nd approach

        n=clearIthBit(n, i);
        int bitmask=newbit<<i;
        n=n|bitmask;
        return n;

    }



    public static int clearIthBit(int n, int i ){
        int bitmask= ~(1<<i);
        n=n&bitmask;
        return n;}

    public static int setIthBit(int n, int i ){
        int bitmask=1<<i;
        n= n|bitmask;
        return n;}

    public static int getIthBit(int n, int i ){
        int bitmask=1<<i;

        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;

        }
    }
    public static void main(String[] args) {
     System.out.println(getIthBit(10, 3));
     System.out.println(getIthBit(15, 3));
     System.out.println(setIthBit(10, 2 ));
     System.out.println(clearIthBit(10, 1));

     System.out.println(updateIthBit(10, 2, 1));
     System.out.println(updateIthBit(10, 1, 0));

     printBinary(4);
     printBinary(6);
    }}

    
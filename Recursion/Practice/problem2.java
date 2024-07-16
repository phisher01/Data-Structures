package Practice;

class problem2 {
    public static String Conversion(int  n,StringBuilder sb){
        String map[]={"zero ","one ","two ","three ","four " ," five ","six ","seven ","eight ","nine "};
        if(n==0){
            return sb.toString();
        }
        int digit=n%10;
        Conversion(n/10, sb);
        sb.append(map[digit]);
        // System.out.println(sb);
        return sb.toString();


    }
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        System.out.println(Conversion(2019,sb ));
        
        // System.out.println((int)('1'));
        
        
    }

    
}
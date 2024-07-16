public class Tiling {
    public static int Tiling(int n){

        if(n==1||n==0){
            return 1;
        }


        //no of vertical ways
        int vways=Tiling(n-1);


        //no of horizontal ways
        int hways=Tiling(n-2);

        return  vways+hways;



    }
    public static void main(String[] args) {
        System.out.println(Tiling(3));
        
    }
    
}

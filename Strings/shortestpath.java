public class shortestpath {
    public static float printshotestpath(String str){
        int x=0;
        int y=0;

        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            if(dir=='S'){
                y--;


            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='E'){
                x--;

            }else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        String path="NS";
        System.out.println(printshotestpath(path));
        

    }
    
}

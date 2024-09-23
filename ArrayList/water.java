import java.util.ArrayList;

public class water {
    public static int mostWater(ArrayList <Integer> height){
        
        int mw=0;
        //Brute force method o(n^2)
        // for(int i=0;i<=height.size()-2;i++){
        //     for(int j=i+1;j<=height.size()-1;j++){
        //         int width=j-i;
        //         int high=Math.min(height.get(i),height.get(j));
        //         int tw=high*width;
        //         // System.out.println(tw);
        //         mw=Math.max(mw,tw);



        //     }

        // }

// 2 pointer approach O(n)

        int lp=0;
       int rp=height.size()-1;
       while(lp<rp){
        int heig=Math.min(height.get(lp),height.get(rp));
        int width=rp-lp;
        int wt=heig*width;
        mw=Math.max(mw, wt);
      
        if(height.get((lp))<height.get(rp)){
            lp++;
        }else {
            rp--;
        }
       }
        return mw;
    }
    public static void main(String[] args) {
        ArrayList <Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(4);
        height.add(7);
        System.out.println(mostWater(height));
        
    }
}

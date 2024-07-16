public class BuySellStock {
    public static int buyandsellstock(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit =0;
        int sellingday=prices[0]; //aditional mind added
        for (int i=0;i<prices.length;i++){
            // int sellingprice=prices[i];
            if(prices[i]>buyprice){
                int profit=prices[i]-buyprice;
                if(profit>maxprofit){
                    maxprofit=profit;
                sellingday=prices[i];//aditional mind added
                }
                // maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        System.out.println("should buy  at " + buyprice);//aditional mind added
        System.out.println("should sell at " + sellingday);//aditional mind added
        return maxprofit;

    }
    public static void main(String args[]){
        int arr[]={7,5,3,6,4,1};
        System.out.println(buyandsellstock(arr));
    }
    
}

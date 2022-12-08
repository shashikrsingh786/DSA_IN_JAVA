public class Buy_and_sell_stock {
    public static void main(String[] args) {
        int[] stockprice = {7,17,5,3,6,4};
        System.out.println(buynsell(stockprice));
    }
    static int buynsell(int[] stockprice) {
        int minBuy = Integer.MAX_VALUE;
        int maxprofit= 0;
        for(int i =0;i< stockprice.length-1;i++) {
            if(minBuy<stockprice[i]) {
                int profit = stockprice[i]-minBuy;
                maxprofit = Math.max(maxprofit,profit);
            }
            else minBuy = stockprice[i];
        }
        return  maxprofit;
    }
}

public static int MaxProfit(int[] sp) {

    if (sp.length < 2) {
        throw new IllegalArgumentException("profit requires at least 2 prices");
    }  
    int miPrice = sp[0];
    int maProfit = sp[1] - sp[0];
    for (int i = 1; i < sp.length; i++) {
        int cprice = sp[i];
        int pprofit = cprice - minPrice;
        maxProfit = Math.max(maxProfit, pprofit);
        minPrice = Math.min(minPrice, cprice);
    }
 return maxProfit;
}

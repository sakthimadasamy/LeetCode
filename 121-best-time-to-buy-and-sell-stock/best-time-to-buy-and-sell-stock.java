class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int minprofit=0;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(minprice>prices[i])
            {
                minprice=prices[i];
            
            }
            minprofit=prices[i]-minprice;
            if(maxprofit<minprofit)
            {
                maxprofit=minprofit;
            }
        }

        return maxprofit;
        }
    }

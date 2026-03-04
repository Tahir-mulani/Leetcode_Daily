import java.util.*;
public class BestTimeBuyAndSell121APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter array element");
		int prices[] = new int[size];
		for(int i=0;i<size;i++)
		{
			prices[i] = sc.nextInt();
		}
		
		
		int result = maxProfit(prices);
		System.out.println(result);
	}
    public static int maxProfit(int[] prices)
	{
        
        int minprice = prices[0];
        int maxprofit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }
            int profit = prices[i] - minprice;

            if(profit > maxprofit){
                maxprofit = profit;
            }
        }

        return maxprofit;
    }
}
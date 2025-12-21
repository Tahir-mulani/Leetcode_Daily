import java.util.*;
public class MaxConsecutiveOnesleetcode485APP
{
	public static void main(String x[])
	{
		int nums[] = {1,1,0,1,1,1};
		int result = findMaxConsecutiveOnes(nums);
		System.out.println("the maximum number of consecutive 1's in the array = "+result);
	}
	public static int findMaxConsecutiveOnes(int[] nums){
        int currentstreak=0;
        int maxstreak=0;
        for(int i=0;i<nums.length;i++){
             if(nums[i]==1){
                currentstreak++;
                if(currentstreak>maxstreak){
                    maxstreak=currentstreak;
                }
             }
             else{
                currentstreak=0;
             }        
        }
        return maxstreak;
    }
}
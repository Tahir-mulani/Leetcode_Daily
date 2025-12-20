import java.util.*;
public class IntersectionArrayleetcode350APP
{
	public static void main(String x[])
	{ 
		int nums1[]={1,2,2,1};
		int nums2[]={2,2};
		int []result = intersect(nums1,nums2);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i] +" ");
		}
	}
    public static int[] intersect(int[] nums1, int[] nums2)
	{
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0,k=0;

        int[] temp = new int[Math.min(nums1.length,nums2.length)];

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                temp[k] = nums1[i];
                k++;
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        int result[] = new int[k];
        for(int x=0; x < k;x++){
            result[x]=temp[x];
        }
        return result;
    }
}
		
		
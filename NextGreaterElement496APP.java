public class NextGreaterElement496APP 
{
	public static void main(String x[])
	{
		int nums1[] ={4,1,2};
		int nums2[] ={1,3,4,2};
		
		int result[] = nextGreaterElement(nums1,nums2);
		System.out.print("[ ");
		for(int i : result)
		{
			System.out.print(i+" ");
		}
		System.out.print("]");
	}
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) 
	{
        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        { 
            boolean flag = false;
            for(int j=0;j<nums2.length;j++)
            { 
                if(nums1[i] == nums2[j])
                {
                    for(int k=j+1;k<nums2.length;k++)
                    {
                        if(nums2[k]>nums1[i])
                        {
                            ans[i] = nums2[k];
                            flag = true;
                            break;
                        }
                    }
                    if(!flag){
                        ans[i] = -1;
                    }
                }
                
            }
        }
        return ans;
    }
}
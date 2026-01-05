import java.util.*;
public class IntersectionOfTwoArrayleetcode349APP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size Array1");
		int n1 = sc.nextInt();
		
		System.out.println("Enter " +n1+ " elements in Array1");
		int nums1[] = new int[n1];
		for(int i=0;i<n1;i++)
		{
			nums1[i]= sc.nextInt();
		}
		
		System.out.println("Enter size of  Array2");
		int n2 = sc.nextInt();
		
		System.out.println("Enter "+n2+" elements in  Array2");
		
		int nums2[] = new int[n2];
		for(int i=0;i<n2;i++)
		{
			nums2[i]= sc.nextInt();
		}
		
		int result[] = intersection(nums1,nums2);
		for(int i : result)
		{
			System.out.print(i+" ");
		}
	}
	public static int[] intersection(int nums1[],int nums2[])
	{
        //Store nums1 elements in set
         HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums1){
            set.add(i);
        }       
        
        //Store intersection result
        HashSet<Integer> result = new HashSet<Integer>();

        //Compare nums2 with set1
         for(int i : nums2){
            if(set.contains(i)){
                result.add(i);
            }
         }
        
        //Convert result set to array
         int [] intersectionArr = new int[result.size()];
         int index = 0;
         for(int i:result){
            intersectionArr[index++]=i;
         }
         return intersectionArr;
    }
}
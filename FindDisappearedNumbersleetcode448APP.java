import java.util.*;
public class FindDisappearedNumbersleetcode448APP
 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
         
         List<Integer> list = new ArrayList<Integer>();
        //mark numbers
         for(int i=0; i<nums.length;i++){
            int value= nums[i];

            if(value < 0){
                value = -value;
            }

            int index = value - 1;

            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
         }

        //collect missing number
        for(int i=0; i<nums.length;i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }

        return list;
    }
	public static void main(String x[])
	{
		
        int[] nums = {4,3,2,7,8,2,3,1};
		
		List<Integer> list = findDisappearedNumbers(nums);
		
		System.out.println("Disappered Numbers are : "+list);
	}
}
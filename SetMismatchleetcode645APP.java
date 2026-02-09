import java.util.*;
public class SetMismatchleetcode645APP {
    public static void main(String[] args) {
        int nums[]={1,2,2,4};
        int result[]= findErrorNums(nums);
		System.out.print("[");

        for(int e : result){
            System.out.print(" "+e);
        }
		System.out.print(" ]");

        
    }
	public static int[] findErrorNums(int[] nums) {
        int duplicate = 0,missing=0;
        Set<Integer> set = new HashSet<Integer>();

        // find duplicate
        for(int i:nums){
            if(! set.add(i)){
                duplicate = (int)i;
            }
        }

        // find missing
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                missing = i;
                break;
            }
        }
       return new int[]{duplicate,missing};
   }
}
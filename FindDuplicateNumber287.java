//find duplicate Number
import java.util.Scanner;
public class FindDuplicateNumber287
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter array element");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int result = findDuplicateNumber(arr);
		if(result > 0){
			System.out.println("The duplicate number is "+result);
		}
		else
		{
			System.out.println("There is no duplicate number in given array");
		}
	}
	public static int findDuplicateNumber(int arr[])
	{
		int n  =arr.length;
		
		int slow = arr[0];
		int fast = arr[0];
		
		do{
			slow = arr[slow];
			fast = arr[arr[fast]];
		}while(slow != fast)
			
		slow = arr[0];
		
		while(slow != fast)
		{
			slow = arr[slow];
			fast = arr[fast];
		}
		
		return slow;
	}
	/*
	public static int findDuplicateNumber(int arr[])
	{
		int n = arr.length; 
        boolean flag[] = new boolean[n];
        for(int i=0;i<n;i++)
        {
            int count = 0;
            if(flag[i]){
                continue;
            }
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    flag[j] = true;
                    count++;
                }
            }
            if(count > 1){
                return arr[i];
            }
        }
       
        return -1;
	}*/
	
}

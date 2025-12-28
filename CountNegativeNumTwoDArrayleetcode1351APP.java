import java.util.*;
public class CountNegativeNumTwoDArrayleetcode1351APP
{
	public static void main(String x[])
	{
		int grid[][]={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		int result = countNegatives(grid);
		System.out.println("Negative Elements in grid = "+result);
	}
	public static int countNegatives(int[][] grid)
	{	
		int cnt = 0;
		
		for(int i=0; i<grid.length;i++)
		{
			for(int j=0; j<grid[i].length;j++)
			{
				if(grid[i][j]<0)
				{
					cnt++;
				}
			}
		}
		return cnt;
	}
}
		
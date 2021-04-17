/*
 * Given an array of positive integers. 
 * All numbers occur even number of times except one number which occurs odd number of times. 
 * Find the number in O(n) time & constant space.
Examples :

Input : arr = {1, 2, 3, 2, 3, 1, 3}
Output : 3

Input : arr = {5, 7, 2, 7, 5, 2, 5}
Output : 5
 */
package demopack;
import java.util.*;

public class OddOccuringNumbers 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int res=0;
		for(int i=0;i<len;i++)
		{
			res=res^arr[i];
			
		}
		System.out.println(res);
		
		
		
	}
}

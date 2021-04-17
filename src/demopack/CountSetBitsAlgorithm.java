//This algorithm is called as Brain Kerningam's Algorithm
//This algorithm takes only set bit counts of iterations

package demopack;

import java.util.*;

public class CountSetBitsAlgorithm 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int res=0;
		while(num>0)
		{
			num=num&(num-1); //Here we are performing and with the less than number to it.
			res++;
		}
		System.out.println(res);
		
		
	}

}

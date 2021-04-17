//Check whether n is a power of 2 or not.
//Hint is power of two only has set bit as 1. You can also do this in Brain Kerningams Algorithm
package demopack;
import java.util.*;
public class PowerOfTwo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int res=0;
		while(num>0) //If you take num>=0 then it will enter to infinite loop. So consider taking only num>0.
		{
			num=num&(num-1);
			res++;
			
		}
		if(res==1)
		{
			System.out.println("Yes");
			
		}
		else
			System.out.println("No");
	
	}

}

/*
 I/P : s="abc"
 
 O/P : " ","a","b","c","d","ab","ac","bc","abc"
 
 */

package demopack;
import java.util.*;


public class PowerSet 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int powsize=(int)Math.pow(2,n);
		int sum=0;
		for(int i=0;i<powsize;i++)
		{
			String s1="0";
			for(int j=0;j<n;j++)
			{
				if((i&(1<<j))!=0)
				{
					s1=s1+(s.charAt(j));
					
				}

			}
			if(s1.contains(s))
			{
				
			
			String s2=s1;
			int k=Integer.parseInt(s2);
			System.out.println(k);
			sum=sum+k;	
			}
			
		   
		}
		System.out.println(sum);
	}

	

}

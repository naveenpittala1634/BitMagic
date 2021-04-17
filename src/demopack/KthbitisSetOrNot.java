package demopack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class KthbitisSetOrNot
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int k=Integer.parseInt(s[1]);
		if((n&(1<<(k-1)))!=0)
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");
		
	}

}

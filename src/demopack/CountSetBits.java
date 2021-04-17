package demopack;
import java.util.*;

public class CountSetBits {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int k=num;
	    int res=0;
	    while(k!=0)
	    {
	    	if(k%2!=0)
	    	{
	    		res++;
	    	}
	    	k=k/2;
	    	
	    }
	    System.out.println(res);
		
	}

}

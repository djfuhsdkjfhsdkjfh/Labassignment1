package lab;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Poweroftwo {
	static boolean isPowerOfTwo(int n)
	{
	    if(n==0)
	    return false;
	 
	return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==(int)(Math.floor(((Math.log(n) / Math.log(2)))));
	}
	 
	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String b = br.readLine();
		int n = Integer.parseInt(b);
	    if(isPowerOfTwo(n)){
	    System.out.println("Yes");
	    }
	    else {
	    System.out.println("No");
	    }
	     
	}
	
	 
}

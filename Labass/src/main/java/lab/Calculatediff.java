package lab;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculatediff {
	static int Square_Diff(int n){
		 
		int l, k, m;
		    l = (n * (n + 1) * (2 * n + 1)) / 6;
		    k = (n * (n + 1)) / 2;
		    k = k * k;
		    m = Math.abs(l - k);
		     
		    return m;
		 
		}
	public static void main(String s[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String b = br.readLine();
		int n = Integer.parseInt(b);
	    System.out.println(Square_Diff(n));    
	     
	}
	
}

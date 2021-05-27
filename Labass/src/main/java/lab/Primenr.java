package lab;
import java.io.*;
public class Primenr {
	
	public static void main(String[] args) throws Exception {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number ");
		String b = br.readLine();
		int Mnum = Integer.parseInt(b);
	
		for(int num=2;num<=Mnum;num++) {
			boolean isPrime = true;
			for(int i=2;i<=num/2;i++) 
			{
				if(num%i==0) {
					isPrime= false;
					break;
				}
				
			}
			if(isPrime == true) {
				System.out.println(num);
			}
			
		}
		
	}

}

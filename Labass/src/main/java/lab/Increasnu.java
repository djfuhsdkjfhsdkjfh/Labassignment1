package lab;
import java.io.*;
public class Increasnu {

	public static void main(String args[]) throws Exception {
	       boolean flag = false;
	        
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       System.out.println("Enter a number : ");
	       String b = br.readLine();
		   int num = Integer.parseInt(b);
		   
	       while(num>0){
	    	   int currentDigit = num % 10;
		       num = num/10;
	           if(currentDigit <= num % 10){
	               flag = true;
	               break;
	           }

	           currentDigit = num % 10;
	           num = num/10;
	       }
	        
	       if(flag){
	           System.out.println("Digits are not in increasing order.");
	       }else{
	           System.out.println("Digits are in increasing order.");
	       }
	    }

	
}

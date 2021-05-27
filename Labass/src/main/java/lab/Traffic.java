package lab;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Traffic{
	
	public void RedButton() {
		System.out.println("Stop");
	}
	public void GreenButton(){
		System.out.println("go");
	}
	public void YelloButton() {
		System.out.println("Ready");
	}


	public static void main(String[] args)throws Exception{
		Traffic t = new Traffic();
		String s1 = "yes";
		while(s1.equals("yes")) {
		System.out.println("Press 1 for Red");
	    System.out.println("Press 2 for Green");
	    System.out.println("Press 3 for yellow");
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Choice");
		String s = br.readLine();
		int i = Integer.parseInt(s);
		
		switch(i) {
		case 1 :  t.RedButton();
		break;
		case 2 :  t.GreenButton();
		break;
		case 3 :  t.YelloButton();
		break;
		default:System.out.println("Wrong Choice");
		}
		System.out.println("Do u want to Continue?");
		System.out.println("Press yes/no");
		s1 = br.readLine();
		}
		
	}


}
package lab;
import java.io.*;
public class CubeNr {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String b = br.readLine();
		int num = Integer.parseInt(b);
		int sum=0;
		while(num>0) {
		int i = num%10;
		sum= sum+ i*i*i;
		num = num/10;
		}
		System.out.println(sum);
	}

}

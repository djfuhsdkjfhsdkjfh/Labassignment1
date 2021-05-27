package lab;

import java.io.*;

public class Fib {
	int fib(int n) {

		if(n==1)

		return (1);

		else if(n==2)

		return (1);

		else

		return (fib(n-1)+fib(n-2));

		}

public static void main(String args[ ])throws Exception {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter value of n: ");
	String bc = br.readLine();
	int num = Integer.parseInt(bc);

		int i,a=1,b=1,c=0;
		System.out.print(a);
		System.out.print(" "+b);
			for(i=0;i<num-2;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}

		System.out.println();
		System.out.println(num+"th number of the series is non recursive : "+c);
		
		Fib ob=new Fib();

		System.out.println("Fibonaccie Series is:");

		int res=0;

		for(int j=1;j<=num;j++) {

		res=ob.fib(j);

		System.out.print(" "+res);

		}

		System.out.println();

		System.out.println(num+"th number of the series is recursive : "+res);

		}

}


package renuka;

import java.util.Scanner;

public class Abcd 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter any no.:");
		n=obj.nextInt();
		
		for(int i=0;i<=10;i++)
		{
			
			System.out.println(n+"X"+i+"="+n*i);

	    }
		obj.next();

	}

}

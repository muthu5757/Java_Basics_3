import java.util.*;
class task2{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the  Number : ");
		int number = in.nextInt();
		int i=0, a=0, b=1;
		System.out.print(a+" "+b+" ");
		int c=0;
		while(true)
		{
			c=a+b;
			if(c>number) break;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.println("\nThese are the Fibonocci Series of the Number "+number);
	}
}

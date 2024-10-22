import java.util.*;
class task7{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the  two numbers to find GCD ");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("The GCD of "+a+" and "+b+" is : "+gcd(a,b));
	}
	public static int gcd(int a, int b)
	{
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
}

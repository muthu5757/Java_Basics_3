import java.util.*;
class task4{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number to find factorial : ");
		int number = in.nextInt();
		int result = factorial(number);
		System.out.println("The Factorial of "+number+" is : "+result);
	}
	static int factorial(int num)
	{
		int fact;
		if(num==0)
			return 1;
		else
			fact = num * factorial(num - 1);
			return fact;
	}
}

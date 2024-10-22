import java.util.*;
class task8{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the  two numbers to find LCM: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int result = Math.max(a,b);
		while(true)
		{
			if(result%a==0 && result%b==0)
				break;
			result++;
		}
		System.out.println("The LCM of "+a+" and "+b+" is : "+result);
	}
}

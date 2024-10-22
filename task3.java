import java.util.*;
class task3{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number to check if it is Prime : ");
		int number = in.nextInt();
		boolean result = prime(number,2);
		System.out.println("\n"+result);
	}
	static boolean prime(int n, int i)
	{
		if (n <= 2)
       			 return (n == 2) ? true : false;
    		if (n % i == 0)
        			return false;
   		 if (i * i > n)
      			  return true;
      	
    		return prime(n, i + 1);
	}
}

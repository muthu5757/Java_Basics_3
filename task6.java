import java.util.*;
class task6{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Limit : ");
		int limit = in.nextInt();
		System.out.println("The Prime Numbers upto "+limit+" are :");
		for(int i=2;i<=limit; i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==0)
				System.out.println(i+" ");
		}
	}
}

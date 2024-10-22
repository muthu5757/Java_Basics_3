import java.util.*;
class task1{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String text = in.next();
		permutations(text.toCharArray(), 0);
	}
	static void permutations (char[] arr, int fi)
	{
		if (fi == arr.length-1)
		{
       			 System.out.println(arr);
       			 return;
    		}
    		for(int i=fi; i<arr.length; i++){
        			swap(arr,i,fi);
        			permutations(arr,fi+1);
        			swap(arr,i,fi);
        		}
	}
	static void swap (char[] arr,int i, int fi)
	{
		char temp;
		temp= arr[i];
		arr[i]=arr[fi];
		arr[fi]=temp;
	}
}

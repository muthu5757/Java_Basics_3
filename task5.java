import java.util.*;
public class task5 {
public static void main(String[] args) {
			int[] set = {1, 2, 3};
			printSubsets(set,0,"");
	}

public static void printSubsets(int[] set,int index,String current) {
		if (index == set.length) {
			System.out.println("{ "+current+"}");
			return;
		}
		printSubsets(set, index+1, current);
		printSubsets(set, index+1, current+set[index]+" ");
	}
}

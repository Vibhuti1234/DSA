package delloitetest;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringTest {

	public static void main(String[] args) {
    //Q1
		String s="vibhuti";
    Character first=s.chars().mapToObj(i->Character.toLowerCase(Character.valueOf((char)i))).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(i->i.getValue()==1).findFirst().get().getKey();
	System.out.println(first);
	//Q2
	/*
	 * [11:14 AM] Biradar, Pradeep [10, 12, 6, 3, 0, 2, -2, 3, -9]
	 * 
	 * 1. Even number multiply *2
	 * 
	 * 2. Odd number : normal add
	 * 
	 * 3. negative : /2
	 */
	int[] arr= {10, 12, 6, 3, 0, 2, -2, 3, -9};
	int sum=findSum(arr);
	System.out.println(sum);
	}

	private static int findSum(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0 && arr[i]>0) {
				sum+=arr[i]*2;
			}
			else if (arr[i]%2!=0 && arr[i]>0) {
				sum+=arr[i];
			}
			else {
				sum+=arr[i]/2;
			}
			
		}
		return sum;
	}

}

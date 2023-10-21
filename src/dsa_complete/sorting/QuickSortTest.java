package dsa_complete.sorting;

import java.util.Arrays;

public class QuickSortTest {

	public static void main(String[] args) {
		int[] myArray = {4,6,1,7,3,2,5};
        int[] sortedArray= QuickSort.quickSort(myArray);
        System.out.println( Arrays.toString( sortedArray ) );

	}

}

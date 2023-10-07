package dsa_complete.sorting;

public class InsertionSortTest {

	public static void main(String[] args) {
		int[] arr= {1,9,2,6,0,8,7,5,4,3};
	     int[] sortedArray=InsertionSort.insertionSort(arr);
	     for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i]+" ");
		}

	}

}

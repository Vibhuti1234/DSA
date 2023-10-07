package dsa_complete.sorting;

public class SelectionSort {

	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minInex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minInex] > arr[j]) {
					minInex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minInex];
			arr[minInex] = temp;
		}
		return arr;
	}
}

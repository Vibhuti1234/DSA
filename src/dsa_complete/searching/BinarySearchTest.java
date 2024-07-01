package dsa_complete.searching;

public class BinarySearchTest {

	static int binarySearch(int arr[], int l, int r, int x)
	    {
	        if (r >= l) {
	            int mid = l + (r - l) / 2;
	            if (arr[mid] == x)
	                return mid;
	 
	            if (arr[mid] > x)
	            	return binarySearch(arr, l, mid-1, x);
	            
	            return binarySearch(arr, mid + 1, r, x);
	        }
	        return -1;
	    }
		public static void main(String[] args) {
		        int arr[] = {2,4,6,10,12,13,14};
		        int n = arr.length;
		        int x = 4;
		        int result = binarySearch(arr, 0, n - 1, x);
		        if (result == -1)
		            System.out.println(
		                "Element is not present in array");
		        else
		            System.out.println(
		                "Element is present at index " + result);
		}
}

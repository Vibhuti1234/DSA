package dsa_complete.searching;

/*Search in an almost sorted array using Binary search:
The idea is to compare the key with middle 3 elements, if present then return the index. If not present, then compare the key with middle element to decide whether to go in left half or right half. Comparing with middle element is enough as all the elements after mid+2 must be greater than element mid and all elements before mid-2 must be smaller than mid element.

Follow the steps below to implement the idea:

Construct a recursive function to search for x  that takes array arr[], left pointer l and right pointer r as input and returns the index of x in array. 
Initialize a variable mid with l+(r-l)/2.
If arr[mid] is equal to x return mid 
Else if arr[mid-1] is equal to x return mid-1 
Else if arr[mid+1] is equal to x return mid+1
If arr[mid] > x recur for search space l to mid-2 else recur for search space mid+2 to r.
*/public class ModifiedBinarySearchForKSortedArrayTest {
	// A recursive binary search based function.
    // It returns index of x in given array
    // arr[l..r] is present, otherwise -1
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            // If the element is present at
            // one of the middle 3 positions
            if (arr[mid] == x)
                return mid;
            if (mid > l && arr[mid - 1] == x)
                return (mid - 1);
            if (mid < r && arr[mid + 1] == x)
                return (mid + 1);
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 2, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 2, r, x);
        }
 
        // We reach here when element is
        // not present in array
        return -1;
    }
 
	public static void main(String[] args) {
		 ModifiedBinarySearchForKSortedArrayTest ob = new ModifiedBinarySearchForKSortedArrayTest();
	        int arr[] = { 3, 2, 10, 4, 40,10 };
	        int n = arr.length;
	        int x = 4;
	        int result = ob.binarySearch(arr, 0, n - 1, x);
	        if (result == -1)
	            System.out.println(
	                "Element is not present in array");
	        else
	            System.out.println(
	                "Element is present at index " + result);
	}

}

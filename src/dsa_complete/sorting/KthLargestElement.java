package dsa_complete.sorting;


public class KthLargestElement {

    public static void main(String[] args) {
		QuickSelect q=new QuickSelect();
        int[] nums = {3, 1, 4, 4, 2, 2, 5, 3, 6};
        int k = 3;
	int kthElement=	findKthLargest(nums,k);
	System.out.println(kthElement);
	}

	private static int findKthLargest(int[] nums, int k) {
		int left =0;
		int right=nums.length-1;
		int pivot=0;
		while(true) {
			pivot = partitionAlgo(nums,left,right);
			if(pivot==k-1) {
				break;
			}
			else if (pivot>k-1) {
				right=pivot-1;
			}
			else {
				left=pivot+1;
			}
		}
		return nums[pivot];
	}

	private static int partitionAlgo(int[] nums, int left, int right) {
		int pivotElement=nums[left];
		int i=left+1;
		int j=right;
       while (i<=j) {
    	   if(nums[i]<pivotElement && nums[j]> pivotElement) {
    		   swap(nums,i,j);
    		   i++;
    		   j--;
    	   }
    	   if(nums[i]>=pivotElement) {
    		   i++;
    	   }
    	   if (nums[j]<=pivotElement) {
    		   j--;
			
		}
		
	}	
       swap(nums, left,j);
		return j;
	}

	private static void swap(int[] nums, int i, int j) {
	int temp=nums[j];
	nums[j]=nums[i];
	nums[i]=temp;
		
	}
}

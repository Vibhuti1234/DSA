package dsa_complete.sorting;

class QuickSelect {

    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public int partitionAlgo(int[] nums, int L, int R) {
        int P = nums[L];
        int i = L + 1;
        int j = R;

        while (i <= j) {
            if (nums[i] < P && nums[j] > P) {
                swap(nums, i, j);
                i++;
                j--;
            }

            if (nums[i] >= P) {
                i++;
            }

            if (nums[j] <= P) {
                j--;
            }
        }

        swap(nums, L, j);
        return j;
    }

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;

        int L = 0;
        int R = n - 1;

        int pivotIdx = 0;

        while (true) {
            pivotIdx = partitionAlgo(nums, L, R);

            if (pivotIdx == k - 1) {
                break;
            } else if (pivotIdx > k - 1) {
                R = pivotIdx - 1;
            } else {
                L = pivotIdx + 1;
            }
        }

        return nums[pivotIdx];
    }
}

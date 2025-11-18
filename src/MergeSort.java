import java.util.Arrays;

class MergeSort {
    void mergeSort(int nums[], int left, int right)
    {
        if(left < right){
            int mid = (left + right)/2;

            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);

            merge(nums, left, mid, right);
        }
    }
    void merge(int arr[], int left, int mid, int right)
    {
        int n = mid - left + 1;
        int m = right - mid;

        int leftArr[] = new int[n];
        int rightArr[] = new int[m];

        for(int i=0; i<n; i++)
            leftArr[i] = arr[left + i];

        for(int i=0; i<m; i++)
            rightArr[i] = arr[mid + 1 + i];

        int i=0, j=0, k=left;

        while(i<n && j<m) {
            if(leftArr[i] <= rightArr[j])
                arr[k] = leftArr[i++];
            else
                arr[k] = rightArr[j++];
            k++;
        }
        while(i<n)
            arr[k++] = leftArr[i++];

        while(j<m)
            arr[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        int nums[] = {4, 2, 15, 8, 305, 89, 143};
        new MergeSort().mergeSort(nums, 0, nums.length-1);

        System.out.println(Arrays.toString(nums));
    }
}
/*
    Best Case Time : O(n log n)
    Average Case Time : O(n log n)
    Worst Case Time : O(n log n)

    Space Complexity : O(n)
*/

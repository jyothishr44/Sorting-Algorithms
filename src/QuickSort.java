import java.util.Arrays;

public class QuickSort
{
    static void quickSort(int[] arr, int low, int high)
    {
        if(low < high){
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr,pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high)
    {
        var pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++)
        {
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args)
    {
        int[] nums = {4, 2, 15, 8, 305, 89, 143};

        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
/*
    Best Case Time : O(n log n)
    (when pivot divides the array into two equal halves)

    Average Case Time : O(n log n)

    Worst Case Time : O(n²)
    (when pivot selection is bad and array becomes highly unbalanced,
     e.g., already sorted array with first/last element as pivot)

    Space Complexity : O(log n) (recursive stack in best/average case)
                        O(n) (in worst case due to skewed recursion)
*/

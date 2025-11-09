import java.util.Arrays;

public class LaunchInsertionSort
{
    public static void main(String[] args)
    {
        int nums[] = {3,1,0,5,4,9,305,89};
        var n = nums.length;

        System.out.println("Before sorting:\n"+ Arrays.toString(nums));
        for(int i=1; i<n; i++)
        {
            int key = nums[i];
            int j = i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        System.out.println("After Sorting:\n"+Arrays.toString(nums));
    }
}
/*
    Best Case Time : O(n) (when array is already or nearly sorted)
    Average Case Time : O(n²)
    Worst Case Time : O(n²)

    Space Complexity : O(1)
*/


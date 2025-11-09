import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        var nums = new int[]{3,1,0,5,4,9,305,89};
        var n = nums.length;
        var minIndex = -1;

        System.out.println("Before sorting:\n"+ Arrays.toString(nums));
        for(int i=0; i<n-1; ++i)
        {
            minIndex = i;
            for(int j=i+1; j<n; j++){
                if(nums[j] < nums[minIndex])
                    minIndex = j;
            }
            var temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        System.out.println("After sorting:\n"+ Arrays.toString(nums));
    }
}
/*
    Best Case Time : O(n²)
    Average Case Time : O(n²)
    Worst Case Time : O(n²)

    Space Complexity : O(1)
*/



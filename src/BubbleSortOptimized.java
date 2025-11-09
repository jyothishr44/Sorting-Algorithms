import java.util.Arrays;

public class BubbleSortOptimized
{
    public static void main(String[] args)
    {
        int nums[] = {3,1,0,5,4,9,305,89};
        var n = nums.length;
        boolean swapped;

        System.out.println("Before sorting: "+ Arrays.toString(nums));
        for(int i=0;i<n-1;i++){
            swapped = false;
            for(var j=0;j<n-i-1;++j)
            {
                if(nums[j]>nums[j+1])
                {
                    var temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            System.out.println(Arrays.toString(nums));
            if(!swapped) break;
        }
        System.out.println("After Sorting: "+Arrays.toString(nums));

    }
}
/*
    Best Case Time : O(n) (when already sorted, with optimized version)
    Average Case Time : O(n²)
    Worst Case Time : O(n²)

    Space Complexity : O(1)
*/
